package pt.utad.mei.aps;

public class HeavyWeight implements Vehicle {
    @Override
    public String getMotor() {
        return "DIESEL 4000cc 300hp";
    }

    @Override
    public void show() {
        System.out.println("HEAVYWEIGHT: " + getMotor());
    }
}
