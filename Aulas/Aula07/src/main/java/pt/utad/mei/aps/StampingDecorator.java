package pt.utad.mei.aps;

public abstract class StampingDecorator implements StampableObject {
    private final StampableObject stampableObject;

    public StampingDecorator(StampableObject stampableObject) {
        this.stampableObject = stampableObject;
    }

    @Override
    public String getName() {
        return stampableObject.getName();
    }

    @Override
    public double getPrice() {
        return stampableObject.getPrice();
    }
}
