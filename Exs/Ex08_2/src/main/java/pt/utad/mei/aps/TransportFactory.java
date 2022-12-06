package pt.utad.mei.aps;

public class TransportFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Transport();
    }
}
