package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Bookshop bookshop = new Bookshop("Livraria Leya");

        bookshop.addProduct(new Book("The Lord of the Rings", "J.R.R. Tolkien", ProductFormat.PHYSICAL, 20));
        bookshop.addProduct(new Book("The Lord of the Rings", "J.R.R. Tolkien", ProductFormat.DIGITAL, 10));
        bookshop.addProduct(new Game("The Witcher 3", "CD Projekt Red", ProductFormat.DIGITAL, 30));
        bookshop.addProduct(new Game("Monopoly", "Hasbro", ProductFormat.PHYSICAL, 15));
        bookshop.addProduct(new Magazine("National Geographic", "National Geographic Society", ProductFormat.PHYSICAL, 5));
        bookshop.addProduct(new Magazine("National Geographic", "National Geographic Society", ProductFormat.DIGITAL, 2));

        bookshop.printProducts();

        bookshop.checkDiscount();
    }
}