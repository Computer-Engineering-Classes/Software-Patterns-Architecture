package pt.utad.mei.aps;

public class Exclusive extends Vehicle {
    public Exclusive() {
        super(Chassis.SUV, Motor.ELECTRIC, 19);
    }

    @Override
    public void show() {
        System.out.println("Exclusive:");
        System.out.println("Chassis: " + getChassis());
        System.out.println("Motor: " + getMotor());
        System.out.println("Wheels: " + getWheelSize() + "in");
    }
}
