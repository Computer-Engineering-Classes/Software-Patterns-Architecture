package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("Hello");
        Singleton s2 = Singleton.getInstance("World");
        Singleton s3 = Singleton.getInstance("!");

        s1.doSomething();
        System.out.println("Singleton objects:");
        System.out.println("\tS1: " + s1);
        System.out.println("\tS2: " + s2);
        System.out.println("\tS3: " + s3);
    }
}