package pt.utad.mei.aps;

public class Color {
    private final ColorName name;
    private final int red;
    private final int green;
    private final int blue;

    public Color(ColorName name, int red, int green, int blue) {
        this.name = name;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public ColorName getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name=" + name +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
