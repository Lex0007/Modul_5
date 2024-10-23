import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Angebot angebot = new Angebot(210, new GregorianCalendar(2024, 10, 22), "FL110");
        Angebot angebot1 = new Angebot(510, new GregorianCalendar(2024, 2, 12), "FL130");
        Angebot angebot2 = new Angebot(450, new GregorianCalendar(2024, 5, 22), "FL210");

        String formattedDate = sdf.format(angebot.getFlugdatum().getTime());
        String formattedDate1 = sdf.format(angebot1.getFlugdatum().getTime());
        String formattedDate2 = sdf.format(angebot2.getFlugdatum().getTime());

        System.out.println("Angebot Details:");
        System.out.println("Preis: " + angebot.getReduzierterPreis());
        System.out.println("Datum: " + formattedDate);
        System.out.println("Flugnummer: " + angebot.getFlugnummer());
        System.out.println(" ");
        System.out.println("Angebot Details:");
        System.out.println("Preis: " + angebot1.getReduzierterPreis());
        System.out.println("Datum: " + formattedDate1);
        System.out.println("Flugnummer: " + angebot1.getFlugnummer());
        System.out.println(" ");
        System.out.println("Angebot Details:");
        System.out.println("Preis: " + angebot2.getReduzierterPreis());
        System.out.println("Datum: " + formattedDate2);
        System.out.println("Flugnummer: " + angebot2.getFlugnummer());


    }

}





