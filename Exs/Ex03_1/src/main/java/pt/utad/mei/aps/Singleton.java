package pt.utad.mei.aps;

public class Singleton {
    private static Singleton instance;
    // There might be other context attributes
    private final String contextAttribute;

    private Singleton(String contextAttribute) {
        this.contextAttribute = contextAttribute;
    }

    public static Singleton getInstance(String contextAttribute) {
        if (instance == null) {
            instance = new Singleton(contextAttribute);
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing something...");
    }

    @Override
    public String toString() {
        return "Singleton [contextAttribute=" + contextAttribute + "]";
    }
}
