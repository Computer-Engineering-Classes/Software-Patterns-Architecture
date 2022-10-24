package pt.utad;

import java.util.Objects;

public abstract class Gadget {
    private final int x;

    private final int y;

    private final Color color;

    public Gadget(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Gadget(Gadget target) {
        this.color = target.color;
        this.x = target.x;
        this.y = target.y;
    }

    public void move() {
        System.out.println("Gadget has moved...");
    }

    public void destroy() {
        System.out.println("Gadget has been destroyed!");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void details() {
        System.out.println("Gadget details:");
        System.out.println("Color: " + getColor());
        System.out.println("Position: (" + getX() + ", " + getY() + ")");
    }

    public Color getColor() {
        return color;
    }

    @Override
    public abstract Gadget clone();

    public abstract String getPrize();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gadget gadget = (Gadget) o;
        return getX() == gadget.getX() && getY() == gadget.getY() && getColor() == gadget.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getColor());
    }
}
