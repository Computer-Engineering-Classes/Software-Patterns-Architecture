package pt.utad.mei.aps;

public class VehicleFactoryFactory {
    public static VehicleFactory getVehicleFactory(VehicleType vehicleType) {
        switch (vehicleType) {
            case C1 -> {
                return new C1Factory();
            }
            case EXCLUSIVE -> {
                return new ExclusiveFactory();
            }
            case TRANSPORT -> {
                return new TransportFactory();
            }
        }
        return null;
    }
}
