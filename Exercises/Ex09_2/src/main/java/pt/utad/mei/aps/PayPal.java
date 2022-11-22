package pt.utad.mei.aps;

public class PayPal {
    private final String email;
    private double balance;

    public PayPal(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    public void pay(double amount, String type) {
        if (type.equals("credit")) {
            balance += amount;
            System.out.println("Paid " + amount + " with PayPal credit " + email + " (balance: " + balance + ")");
        } else if (type.equals("debit")) {
            balance -= amount;
            System.out.println("Paid " + amount + " with PayPal debit " + email + " (balance: " + balance + ")");
        }
    }

    @Override
    public String toString() {
        return "PayPal{" + "email=" + email + ", balance=" + balance + '}';
    }
}
