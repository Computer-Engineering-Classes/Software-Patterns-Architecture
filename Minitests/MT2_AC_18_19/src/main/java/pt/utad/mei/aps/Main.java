package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("red", "Ferrari", 300);
        Driver driver = new Driver("John", 25, 1);
        car.addObserver(driver);
        car.turnOn();

        car.accelerate(50);
        System.out.println("Car is in gear " + car.getGear());

        car.accelerate(300);
        System.out.println("Car is in gear " + car.getGear());

        car.brake();
        System.out.println("Car is in gear " + car.getGear());

        car.turnOff();
        car.removeObserver(driver);
        car.print();
    }
}