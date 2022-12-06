package pt.utad.mei.aps;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Client> clients;
    private ClientStrategy strategy;

    public Company(ClientStrategy strategy) {
        this.clients = new ArrayList<>();
        this.strategy = strategy;
    }

    public void setStrategy(ClientStrategy strategy) {
        this.strategy = strategy;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void identifyClients() {
        strategy.sort(clients);
        // Print top 3 clients
        System.out.println("Top 3 clients:");
        for (int i = 0; i < 3; i++) {
            System.out.println(clients.get(i));
        }
    }
}
