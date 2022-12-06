package pt.utad.mei.aps;

public class Main_FactoryMethod {
    public static void main(String[] args) {
        var factory = new VehicleFactory();

        var vehicle = factory.getVehicle(VehicleType.LIGHTWEIGHT);
        vehicle.show();

        var vehicle2 = factory.getVehicle(VehicleType.HEAVYWEIGHT);
        vehicle2.show();
    }
}