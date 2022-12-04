package pt.utad.mei.aps;

public class RadioStation implements Listener {
    private final String name;

    public RadioStation(String name) {
        this.name = name;
    }

    @Override
    public void update(String song) {
        System.out.println(name + " is playing " + song);
    }
}
