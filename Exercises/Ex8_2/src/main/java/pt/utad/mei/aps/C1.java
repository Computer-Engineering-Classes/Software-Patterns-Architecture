package pt.utad.mei.aps;

public class C1 extends Vehicle {
    public C1() {
        super(Chassis.CITY, Motor.GASOLINE, 17);
    }

    @Override
    public void show() {
        System.out.println("C1:");
        System.out.println("Chassis: " + getChassis());
        System.out.println("Motor: " + getMotor());
        System.out.println("Wheels: " + getWheelSize() + "in");
    }
}
