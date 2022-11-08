package pt.utad.mei.aps;

public interface StampableObject {
    String getName();

    double getPrice();

    default void print() {
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
    }
}
