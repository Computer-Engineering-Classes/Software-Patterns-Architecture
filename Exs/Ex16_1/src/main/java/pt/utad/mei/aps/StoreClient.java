package pt.utad.mei.aps;

public class StoreClient implements Client {
    private final String name;

    public StoreClient(String name) {
        this.name = name;
    }

    @Override
    public void update(StoreProduct product) {
        System.out.println("Client " + name + ": Product " + product + " is now available!");
    }
}
