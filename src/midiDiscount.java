public class midiDiscount implements Rabattstrategie{
    @Override
    public String getStrategie() {
        return "midiDiscount";
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return preisOhneNachlass * 0.85;
    }
}
