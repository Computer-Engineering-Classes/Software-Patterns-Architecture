package pt.utad.mei.aps;

public class ExclusiveFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Exclusive();
    }
}
