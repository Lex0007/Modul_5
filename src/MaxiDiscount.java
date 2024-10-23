public class MaxiDiscount implements Rabattstrategie{
    private String bezeichnung;


    @Override
    public String getStrategie() {
        return "Maxidiscount";
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return preisOhneNachlass * 0.7;
    }
}
