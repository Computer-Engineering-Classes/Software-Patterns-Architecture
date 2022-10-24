package pt.utad.mei.aps;

public class ElectricVehicleFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType type) {
        switch (type) {
            case LIGHTWEIGHT -> {
                return new ElectricLightWeight();
            }
            case HEAVYWEIGHT -> {
                return new ElectricHeavyWeight();
            }
        }
        return null;
    }
}
