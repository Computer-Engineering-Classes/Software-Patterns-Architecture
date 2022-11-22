package pt.utad.mei.aps;

public class CombustionVehicleFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(VehicleType type) {
        switch (type) {
            case LIGHTWEIGHT -> {
                return new LightWeight();
            }
            case HEAVYWEIGHT -> {
                return new HeavyWeight();
            }
        }
        return null;
    }
}
