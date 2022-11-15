package pt.utad.mei.aps;

public class Circle {
    private final double x;
    private final double y;
    private final double radius;
    private final Color color;

    public Circle(double x, double y, double radius, ColorName colorName) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = ColorFactory.getColor(colorName);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", color=" + color +
                '}';
    }
}
