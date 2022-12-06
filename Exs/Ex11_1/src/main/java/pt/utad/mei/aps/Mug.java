package pt.utad.mei.aps;

public class Mug implements StampableObject {
    private final String name;
    private final double price;

    public Mug() {
        this.name = "Mug";
        this.price = 9.0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
