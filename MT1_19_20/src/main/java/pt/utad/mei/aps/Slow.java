package pt.utad.mei.aps;

public class Slow extends DragRacer {
    public Slow(Slow target) {
        super(target);
    }

    public Slow() {
        super(75, "175/65R16");
    }

    @Override
    public void show() {
        System.out.println("Slow:");
        System.out.println("Power: " + getPower() + "hp");
        System.out.println("Tires: " + getTires());
    }

    @Override
    public DragRacer clone() {
        return new Slow(this);
    }
}
