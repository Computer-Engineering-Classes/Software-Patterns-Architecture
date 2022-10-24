package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {

        var factory = VehicleFactoryFactory.getVehicleFactory(VehicleType.EXCLUSIVE);

        assert factory != null;
        var vehicle = factory.getVehicle();

        vehicle.show();
    }
}