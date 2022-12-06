package pt.utad.mei.aps;

public record Book(String name, String author, ProductFormat format, double price) implements Product {
    @Override
    public double getDiscount() {
        switch (format) {
            case PHYSICAL -> {
                return 0.30;
            }
            case DIGITAL -> {
                return 0.15;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Book: %s (%s) - %s - %.2f€", name, author, format, price);
    }
}
