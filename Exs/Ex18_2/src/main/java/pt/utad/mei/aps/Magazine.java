package pt.utad.mei.aps;

public record Magazine(String name, String editor, ProductFormat format, double price) implements Product {
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
        return String.format("Magazine: %s (%s) - %s - %.2f€", name, editor, format, price);
    }

}
