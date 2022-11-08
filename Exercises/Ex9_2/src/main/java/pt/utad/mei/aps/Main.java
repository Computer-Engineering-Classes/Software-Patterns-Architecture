package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var creditCard = new CreditCard("45363467", 1000);
        System.out.println(creditCard);

        var creditCardAdapter = new CreditCardAdapter(creditCard);
        creditCardAdapter.payCredit(100);
        System.out.println(creditCard);

        var debitCard = new DebitCard("35489543", 500);
        System.out.println(debitCard);

        var debitCardAdapter = new DebitCardAdapter(debitCard);
        debitCardAdapter.payDebit(600);
        System.out.println(debitCard);

        var paypal = new PayPal("john@gmail.com", 2000);
        System.out.println(paypal);

        var paypalAdapter = new PayPalAdapter(paypal);
        paypalAdapter.payDebit(200);
        System.out.println(paypal);
    }
}