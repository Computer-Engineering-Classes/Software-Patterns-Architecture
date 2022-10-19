package pt.utad.mei.aps;

public class Display {
    private final String brand;
    private final int width;
    private final int height;

    public Display(String brand, int width, int height) {
        this.brand = brand;
        this.width = width;
        this.height = height;
    }

    public String getBrand() {
        return brand;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Brand: " + getBrand() + ", "
        + "Resolution: " + getWidth() + "x" + getHeight();
    }
}
