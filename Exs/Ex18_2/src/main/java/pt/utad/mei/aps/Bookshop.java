package pt.utad.mei.aps;

import java.util.ArrayList;
import java.util.List;

public class Bookshop {
    private final String name;
    private final List<Product> products;

    public Bookshop(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void printProducts() {
        System.out.println("Products in " + name + ":");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @SuppressWarnings("unused")
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void checkDiscount() {
        for (Product product : products) {
            System.out.println(product.name() + " has a discount of " + product.getDiscount());
        }
    }
}
