package pt.utad.mei.aps;

public class ElectricLightWeight implements Vehicle {
    @Override
    public String getMotor() {
        return "ELECTRIC 50kW 170hp";
    }

    @Override
    public void show() {
        System.out.println("LIGHTWEIGHT: " + getMotor());
    }
}
