package checkout.strategy;

public class GooglePayPayment implements IPaymentStrategy {
    @Override
    public String process(double amount) {
        return "Processing GooglePay payment of $" + String.format("%.2f", amount);
    }
}
