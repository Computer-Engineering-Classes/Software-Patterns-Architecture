package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        ClientStrategy strategy = new AmountInvestedStrategy();
        Company utadBanking = new Company(strategy);

        utadBanking.addClient(new Client("John", 1000, 0));
        utadBanking.addClient(new Client("Mary", 1500, 200));
        utadBanking.addClient(new Client("Peter", 0, 14550));
        utadBanking.addClient(new Client("Paul", 2200, 0));
        utadBanking.addClient(new Client("George", 199000, 5000));

        System.out.println("Sorting by amount invested:");
        utadBanking.identifyClients();

        strategy = new AmountAvailableStrategy();
        utadBanking.setStrategy(strategy);

        System.out.println("Sorting by amount available:");
        utadBanking.identifyClients();
    }
}