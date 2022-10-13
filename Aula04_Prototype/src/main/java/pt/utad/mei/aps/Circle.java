package pt.utad.mei.aps;

import java.util.Objects;

public class Circle extends Shape {

    private final int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        this.radius = target.getRadius();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return this.radius == circle.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRadius());
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
