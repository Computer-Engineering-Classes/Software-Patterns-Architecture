package pt.utad.mei.aps;

public class BlackStamping extends StampingDecorator {
    public BlackStamping(StampableObject stampableObject) {
        super(stampableObject);
    }

    @Override
    public String getName() {
        return super.getName() + " with Black Stamping";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }
}
