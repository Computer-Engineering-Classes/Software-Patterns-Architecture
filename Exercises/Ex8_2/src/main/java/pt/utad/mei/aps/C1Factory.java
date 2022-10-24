package pt.utad.mei.aps;

public class C1Factory implements VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new C1();
    }
}
