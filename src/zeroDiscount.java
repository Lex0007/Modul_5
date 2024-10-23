public class zeroDiscount implements Rabattstrategie{
    @Override
    public String getStrategie() {
        return "zeroDiscount";
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return preisOhneNachlass;
    }
}
