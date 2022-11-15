package pt.utad.mei.aps;

public class Tuner {

    public Tuner() {
    }

    public void on() {
        System.out.println("Tuner on");
    }

    public void off() {
        System.out.println("Tuner off");
    }

    public void setAm() {
        System.out.println("Tuner set to ");
    }

    public void setFm() {
        System.out.println("Tuner set to FM");
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner set to frequency " + frequency);
    }
}
