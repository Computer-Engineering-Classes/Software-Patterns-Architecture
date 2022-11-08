package pt.utad.mei.aps;

public class CreditCard {
    private double creditLimit;
    private final String cardNumber;

    public CreditCard(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
    }

    public void payCredit(double amount) {
        if (amount <= creditLimit) {
            creditLimit -= amount;
            System.out.println("Payment of " + amount + " made with credit card " + cardNumber + ".");
        } else {
            System.out.println("Insufficient credit limit.");
        }
    }

    public void payDebit(double ignoredAmount) {
        System.out.println("Debit card payment not allowed.");
    }

    @Override
    public String toString() {
        return "CreditCard{" + "creditLimit=" + creditLimit + ", cardNumber=" + cardNumber + '}';
    }
}
