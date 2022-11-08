package pt.utad.mei.aps;

public class DebitCard {
    private final String cardNumber;
    private double balance;

    public DebitCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void payDebit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment of " + amount + " made with debit card " + cardNumber + ".");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void payCredit(double ignoredAmount) {
        System.out.println("Credit card payment not allowed.");
    }

    @Override
    public String toString() {
        return "DebitCard{" + "cardNumber=" + cardNumber + ", balance=" + balance + '}';
    }
}
