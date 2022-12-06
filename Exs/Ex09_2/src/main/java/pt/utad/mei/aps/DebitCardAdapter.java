package pt.utad.mei.aps;

public class DebitCardAdapter implements PaymentSystem {
    private final DebitCard debitCard;

    public DebitCardAdapter(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    @Override
    public void payCredit(double amount) {
        debitCard.payCredit(amount);
    }

    @Override
    public void payDebit(double amount) {
        debitCard.payDebit(amount);
    }
}
