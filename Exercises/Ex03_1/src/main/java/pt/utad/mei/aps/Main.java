package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("Singleton objects:");
        System.out.println("\tS1: " + s1);
        System.out.println("\tS2: " + s2);
        System.out.println("\tS3: " + s3);
    }
}