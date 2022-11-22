package pt.utad.mei.aps;

public class Line implements DiagramObject {
    private final double length;

    public Line(double length) {
        this.length = length;
    }

    @Override
    public void draw(String color) {
        System.out.println("Line with length " + length + " and color " + color);
    }

    @Override
    public String toString() {
        return "Line{" + "length=" + length + '}';
    }
}
