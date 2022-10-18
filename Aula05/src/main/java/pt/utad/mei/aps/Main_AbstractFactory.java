package pt.utad.mei.aps;

public class Main_AbstractFactory {
    public static void main(String[] args) {
        var factory = VehicleFactoryFactory.getFactory(MotorType.COMBUSTION);

        assert factory != null;
        var vehicle = factory.getVehicle(VehicleType.LIGHTWEIGHT);
        vehicle.show();

        var factory2 = VehicleFactoryFactory.getFactory(MotorType.ELECTRIC);

        assert factory2 != null;
        var vehicle2 = factory2.getVehicle(VehicleType.HEAVYWEIGHT);
        vehicle2.show();
    }
}
