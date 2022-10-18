package pt.utad.mei.aps;

public class VehicleFactoryFactory {
    public static AbstractVehicleFactory getFactory(MotorType motorType) {
        switch (motorType) {
            case COMBUSTION -> {
                return new CombustionVehicleFactory();
            }
            case ELECTRIC -> {
                return new ElectricVehicleFactory();
            }
        }
        return null;
    }
}
