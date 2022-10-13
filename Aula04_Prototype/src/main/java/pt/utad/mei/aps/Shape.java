package pt.utad.mei.aps;

import java.util.Objects;

public abstract class Shape implements Cloneable {

    private final int x;
    private final int y;
    private final String color;

    public Shape(Shape target) {
        this.x = target.getX();
        this.y = target.getY();
        this.color = target.getColor();
    }

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return this.x == shape.getX() && this.y == shape.getY() && this.color.equals(shape.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getColor());
    }

    public abstract Shape clone();
}
