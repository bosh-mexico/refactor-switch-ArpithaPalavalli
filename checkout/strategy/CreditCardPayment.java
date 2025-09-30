package checkout.strategy;

public class CreditCardPayment implements IPaymentStrategy {
    @Override
    public String process(double amount) {
        return "Processing Credit Card payment of $" + String.format("%.2f", amount);
    }
}
