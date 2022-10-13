package pt.utad.mei.aps;

public class Singleton {
    private static Singleton instance;

    // There might be other context attributes
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
