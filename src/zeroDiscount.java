public class zeroDiscount implements Rabattstrategie{
    @Override
    public String getname() {
        return "zeroDiscount";
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return preisOhneNachlass;
    }
}
