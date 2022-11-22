package pt.utad.mei.aps;

import java.util.ArrayList;

public class StoreProduct {
    private final String name;
    private final ArrayList<Client> clients;
    private int stock;

    public StoreProduct(String name) {
        this.name = name;
        this.stock = 0;
        this.clients = new ArrayList<>();
    }

    public void subscribe(Client client) {
        clients.add(client);
    }

    public void unsubscribe(Client client) {
        clients.remove(client);
    }

    public void addStock(int amount) {
        int prevStock = stock;
        stock += amount;
        if (prevStock == 0) {
            notifyClients();
        }
    }

    private void notifyClients() {
        for (Client client : clients) {
            client.update(this);
        }
    }

    @Override
    public String toString() {
        return "StoreProduct{" +
                "name=" + name +
                ", stock=" + stock +
                '}';
    }
}
