package refactoring.guru;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        System.out.println();
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.volumeUp();
        basicRemote.volumeDown();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.channelUp();
        advancedRemote.channelDown();
        advancedRemote.mute();
        device.printStatus();
    }
}