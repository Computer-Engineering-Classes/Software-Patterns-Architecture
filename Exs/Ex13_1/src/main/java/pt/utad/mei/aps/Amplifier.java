package pt.utad.mei.aps;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setInput(String input) {
        System.out.println("Amplifier set to input " + input);
    }

    public void volumeUp() {
        System.out.println("Amplifier volume up " + 1);
    }

    public void volumeDown() {
        System.out.println("Amplifier volume down " + 1);
    }
}
