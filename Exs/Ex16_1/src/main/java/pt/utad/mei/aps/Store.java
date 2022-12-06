package pt.utad.mei.aps;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private final Map<String, StoreProduct> products;

    public Store() {
        this.products = new HashMap<>();
    }

    public void addProduct(String name) {
        products.put(name, new StoreProduct(name));
    }

    public void subscribe(String name, Client client) {
        if (products.containsKey(name)) {
            products.get(name).subscribe(client);
        } else {
            StoreProduct product = new StoreProduct(name);
            products.put(name, product);
            product.subscribe(client);
        }
    }

    public void unsubscribe(String name, Client client) {
        if (products.containsKey(name)) {
            products.get(name).unsubscribe(client);
        }
    }

    public void addStock(String name, int quantity) {
        if (products.containsKey(name)) {
            products.get(name).addStock(quantity);
        } else {
            StoreProduct product = new StoreProduct(name);
            products.put(name, product);
            product.addStock(quantity);
        }
    }
}
