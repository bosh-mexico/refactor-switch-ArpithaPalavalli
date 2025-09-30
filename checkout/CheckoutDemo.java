package com.example.checkout;

public class CheckoutDemo {
    public static void main(String[] args) {
        CheckoutService service = new CheckoutService();
        double amount = 150.75;

        System.out.println(service.checkout(PaymentMode.PAYPAL, amount));
        System.out.println(service.checkout(PaymentMode.GOOGLEPAY, amount));
        System.out.println(service.checkout(PaymentMode.CREDITCARD, amount));
        System.out.println(service.checkout(PaymentMode.UNKNOWN, amount));
    }
}
