package pt.utad.mei.aps;

public class Printer {
    private final String name;

    public Printer(String name) {
        this.name = name;
    }

    public void Print() {
        System.out.println("My name is: " + name);
    }

    @Override
    public String toString() {
        return "Printer{" + this.hashCode() + '}';
    }
}
