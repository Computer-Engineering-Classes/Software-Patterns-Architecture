package pt.utad.mei.aps;

public class Circle implements DiagramObject {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(String color) {
        System.out.println("Circle with radius " + radius + " and color " + color);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
