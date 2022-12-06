package pt.utad.mei.aps;

public class Triangle implements DiagramObject {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(String color) {
        System.out.println("Triangle with base " + base + " and height " + height + " and color " + color);
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }
}
