package pt.utad.mei.aps;

public class Singleton {
    private static Singleton instance = null;

    // pode haver outros atributos de contexto
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
