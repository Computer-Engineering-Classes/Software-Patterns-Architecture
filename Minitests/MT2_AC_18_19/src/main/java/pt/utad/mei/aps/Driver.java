package pt.utad.mei.aps;

public class Driver implements CarObserver {
    String name;
    int age;
    int drivingLicense;

    public Driver(String name, int age, int drivingLicense) {
        this.name = name;
        this.age = age;
        this.drivingLicense = drivingLicense;
    }

    public void update(String message) {
        System.out.println("Driver " + name + " received message: " + message);
    }
}
