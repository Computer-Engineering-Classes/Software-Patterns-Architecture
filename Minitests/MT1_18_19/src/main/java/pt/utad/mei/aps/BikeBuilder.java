package pt.utad.mei.aps;

public class BikeBuilder {
    private BikeType bikeType;
    private String frame;
    private String motor;
    private String wheels;
    private String suspension;

    public BikeBuilder setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
        return this;
    }

    public BikeBuilder addFrame(String frame) {
        this.frame = frame;
        return this;
    }

    public BikeBuilder addMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public BikeBuilder addWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    public BikeBuilder addSuspension(String suspension) {
        this.suspension = suspension;
        return this;
    }

    public Bike getResult() {
        return new Bike(bikeType, motor, wheels, suspension, frame);
    }
}
