package pt.utad.mei.aps;

public class FlyRacer extends DragRacer {
    public FlyRacer(FlyRacer target) {
        super(target);
    }

    public FlyRacer() {
        super(704, "395/50R22");
    }

    @Override
    public void show() {
        System.out.println("FlyRacer:");
        System.out.println("Power: " + getPower() + "hp");
        System.out.println("Tires: " + getTires());
    }

    @Override
    public DragRacer clone() {
        return new FlyRacer(this);
    }
}
