package pt.utad.mei.aps;

public class TShirt implements StampableObject {
    private final String name;
    private final double price;

    public TShirt() {
        this.name = "TShirt";
        this.price = 4.0;
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
