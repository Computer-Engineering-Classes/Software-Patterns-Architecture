package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        StoreClient client = new StoreClient("Diogo");
        StoreClient client2 = new StoreClient("Pedro");

        store.addProduct("Bread");
        store.addProduct("Milk");
        store.addProduct("Eggs");

        store.subscribe("Bread", client);
        store.subscribe("Milk", client2);

        store.addStock("Milk", 10);
        store.addStock("Bread", 5);

        store.unsubscribe("Bread", client);
    }
}