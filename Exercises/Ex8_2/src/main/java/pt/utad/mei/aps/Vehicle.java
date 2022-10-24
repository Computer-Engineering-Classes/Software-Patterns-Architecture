package pt.utad.mei.aps;

public abstract class Vehicle {
    private final Chassis chassis;

    private final Motor motor;
    private final int wheelSize;

    public Vehicle(Chassis chassis, Motor motor, int wheelSize) {
        this.chassis = chassis;
        this.motor = motor;
        this.wheelSize = wheelSize;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Motor getMotor() {
        return motor;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public abstract void show();
}
