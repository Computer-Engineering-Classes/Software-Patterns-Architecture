package pt.utad.mei.aps;

public class LightWeight implements Vehicle {
    @Override
    public String getMotor() {
        return "GASOLINE 900cc 85hp";
    }

    @Override
    public void show() {
        System.out.println("LIGHTWEIGHT: " + getMotor());
    }
}
