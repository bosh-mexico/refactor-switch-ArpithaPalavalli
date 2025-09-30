package checkout.strategy;

public interface IPaymentStrategy {
    String process(double amount);
}
