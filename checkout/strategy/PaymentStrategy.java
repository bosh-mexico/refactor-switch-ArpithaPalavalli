package checkout.strategy;

public interface PaymentStrategy {
    String process(double amount);
}
