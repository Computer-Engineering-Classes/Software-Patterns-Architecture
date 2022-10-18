package pt.utad.mei.aps;

public class ElectricHeavyWeight implements Vehicle {
    @Override
    public String getMotor() {
        return "ELECTRIC 200kW 1000hp";
    }

    @Override
    public void show() {
        System.out.println("HEAVYWEIGHT: " + getMotor());
    }
}
