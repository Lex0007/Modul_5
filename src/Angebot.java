import java.util.GregorianCalendar;

public class Angebot {
    private double regulaerpreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;
    private Rabattstrategie rabattstrategie;

    public Angebot(double regulaerpreis, GregorianCalendar flugdatum, String flugnummer) {
        this.regulaerpreis = regulaerpreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
        setRabattstrategie();
    }

    public void setRabattstrategie() {
        int month = flugdatum.get(GregorianCalendar.MONTH);
        if (month == 1 || month == 4 || month == 10){
            rabattstrategie = new MaxiDiscount();
        }
        else if (month == 2 || month == 3){
            rabattstrategie = new midiDiscount();
        }
        else{
            rabattstrategie = new zeroDiscount();
        }
    }


    public double getRegulaerpreis() {
        return regulaerpreis;
    }

    public GregorianCalendar getFlugdatum() {
        return flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setRegulaerpreis(double regulaerpreis) {
        this.regulaerpreis = regulaerpreis;
    }

    public void setFlugdatum(GregorianCalendar flugdatum) {
        this.flugdatum = flugdatum;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }

    public double getReduzierterPreis(){
        return rabattstrategie.getPreis(regulaerpreis);
    }
}
