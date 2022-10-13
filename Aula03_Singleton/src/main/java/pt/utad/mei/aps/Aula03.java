package pt.utad.mei.aps;

public class Aula03 {
    public static void main(String[] args) {

        var s1 = Singleton.getInstance();
        var s2 = Singleton.getInstance();
        var s3 = Singleton.getInstance();

        System.out.println("Singleton objects:");
        System.out.println("\tS1: " + s1);
        System.out.println("\tS2: " + s2);
        System.out.println("\tS3: " + s3);
    }
}