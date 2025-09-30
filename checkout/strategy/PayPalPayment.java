package checkout.strategy;

public class PayPalPayment implements IPaymentStrategy {
    @Override
    public String process(double amount) {
        return "Processing PayPal payment of $" + String.format("%.2f", amount);
    }
}
