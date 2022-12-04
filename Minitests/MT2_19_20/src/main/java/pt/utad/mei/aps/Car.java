package pt.utad.mei.aps;

public class Car implements CarTankObserver {
    private final String brand;
    private final String model;
    private final CarTank tank;

    public Car(String brand, String model, float tankCapacity) {
        this.brand = brand;
        this.model = model;
        this.tank = new CarTank(tankCapacity);
        this.tank.addObserver(this);
    }

    public void fillTank(float amount) {
        this.tank.fill(amount);
    }

    @Override
    public void update(String message) {
        System.out.println("Car " + this.brand + " " + this.model + " says: " + message);
    }
}
