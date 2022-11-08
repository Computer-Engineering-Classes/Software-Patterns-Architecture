package pt.utad.mei.aps;

public class RGBStamping extends StampingDecorator {
    public RGBStamping(StampableObject stampableObject) {
        super(stampableObject);
    }

    @Override
    public String getName() {
        return super.getName() + " with RGB Stamping";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10.0;
    }
}
