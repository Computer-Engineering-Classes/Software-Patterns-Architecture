package pt.utad.mei.aps;

public class CreditCardAdapter implements PaymentSystem {
    private final CreditCard creditCard;

    public CreditCardAdapter(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void payCredit(double amount) {
        creditCard.payCredit(amount);
    }

    @Override
    public void payDebit(double amount) {
        creditCard.payDebit(amount);
    }
}
