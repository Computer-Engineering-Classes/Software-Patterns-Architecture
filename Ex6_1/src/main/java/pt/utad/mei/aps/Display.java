package pt.utad.mei.aps;

public record Display(String brand, int width, int height) {

    @Override
    public String toString() {
        return "Brand: " + brand() + ", "
                + "Resolution: " + width() + "x" + height();
    }
}
