package pt.utad.mei.aps;

public class Transport extends Vehicle {
    public Transport() {
        super(Chassis.COMMERCIAL, Motor.DIESEL, 19);
    }

    @Override
    public void show() {
        System.out.println("Transport:");
        System.out.println("Chassis: " + getChassis());
        System.out.println("Motor: " + getMotor());
        System.out.println("Wheels: " + getWheelSize() + "in");
    }
}
