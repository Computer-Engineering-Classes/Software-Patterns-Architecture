package pt.utad.mei.aps;

public class Bike {
    private final BikeType bikeType;
    private final String motor;

    private final String wheels;

    private final String suspension;

    private final String frame;

    public Bike(BikeType bikeType, String motor, String wheels, String suspension, String frame) {
        this.bikeType = bikeType;
        this.motor = motor;
        this.wheels = wheels;
        this.suspension = suspension;
        this.frame = frame;
    }

    public BikeType getBikeType() {
        return bikeType;
    }

    public String getMotor() {
        return motor;
    }

    public String getWheels() {
        return wheels;
    }

    public String getSuspension() {
        return suspension;
    }

    public String getFrame() {
        return frame;
    }

    public void details() {
        System.out.println("Bike type: " + getBikeType());
        System.out.println("Frame: " + getFrame());
        System.out.println("Motor: " + getMotor());
        System.out.println("Wheels: " + getWheels());
        System.out.println("Suspension: " + getSuspension());
    }
}
