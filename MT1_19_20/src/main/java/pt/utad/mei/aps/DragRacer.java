package pt.utad.mei.aps;

import java.util.Objects;

public abstract class DragRacer implements Cloneable {
    private final int power;

    private final String tires;

    public DragRacer(DragRacer target) {
        if (target != null) {
            this.power = target.power;
            this.tires = target.tires;
        } else {
            this.power = 0;
            this.tires = "";
        }
    }

    public DragRacer(int power, String tires) {
        this.power = power;
        this.tires = tires;
    }

    public int getPower() {
        return power;
    }

    public String getTires() {
        return tires;
    }

    public abstract void show();

    @Override
    public abstract DragRacer clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DragRacer dragracer = (DragRacer) o;
        return power == dragracer.power && tires.equals(dragracer.tires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, tires);
    }
}
