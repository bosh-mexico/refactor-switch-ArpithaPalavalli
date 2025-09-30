package checkout.strategy;

public class InvalidPayment implements IPaymentStrategy {
    @Override
    public String process(double amount) {
        return "Invalid payment mode selected!";
    }
}
