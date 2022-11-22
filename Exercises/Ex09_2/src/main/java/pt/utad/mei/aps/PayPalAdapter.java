package pt.utad.mei.aps;

public class PayPalAdapter implements PaymentSystem {
    private final PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void payCredit(double amount) {
        paypal.pay(amount, "credit");
    }

    @Override
    public void payDebit(double amount) {
        paypal.pay(amount, "debit");
    }
}
