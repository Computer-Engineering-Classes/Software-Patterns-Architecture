package pt.utad.mei.aps;

public class Tv {
    public void on() {
        System.out.println("TV on");
    }

    public void off() {
        System.out.println("TV off");
    }

    public void setInput(String input) {
        System.out.println("TV set to input " + input);
    }

    public void changeChannel(String channel) {
        System.out.println("TV set to channel " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("TV set to volume " + volume);
    }

    public void volumeUp() {
        System.out.println("TV volume up " + 1);
    }

    public void volumeDown() {
        System.out.println("TV volume down " + 1);
    }
}
