package checkout;

import checkout.strategy.*;

import java.util.HashMap;
import java.util.Map;

public class CheckoutService {

    private final Map<PaymentMode, PaymentStrategy> strategies = new HashMap<>();

    public CheckoutService() {
        strategies.put(PaymentMode.PAYPAL, new PayPalPayment());
        strategies.put(PaymentMode.GOOGLEPAY, new GooglePayPayment());
        strategies.put(PaymentMode.CREDITCARD, new CreditCardPayment());
    }

    public String checkout(PaymentMode mode, double amount) {
        return strategies
                .getOrDefault(mode, new InvalidPayment())
                .process(amount);
    }
}
