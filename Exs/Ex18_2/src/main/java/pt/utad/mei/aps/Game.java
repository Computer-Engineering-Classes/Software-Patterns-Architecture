package pt.utad.mei.aps;

public record Game(String name, String publisher, ProductFormat format,
                   double price) implements Product {
    @Override
    public double getDiscount() {
        if (format == ProductFormat.PHYSICAL) {
            return 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        String typeGame = "Game";
        switch (format) {
            case DIGITAL -> typeGame = "Video Game";
            case PHYSICAL -> typeGame = "Board Game";
        }
        return String.format("%s: %s (%s) - %s - %.2f€", typeGame, name, publisher, format, price);
    }
}
