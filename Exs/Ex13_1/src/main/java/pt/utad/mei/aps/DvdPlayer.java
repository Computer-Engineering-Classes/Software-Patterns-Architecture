package pt.utad.mei.aps;

public class DvdPlayer {
    private String movie;

    public void on() {
        System.out.println("DVD player on");
    }

    public void off() {
        System.out.println("DVD player off");
    }

    public void play() {
        if (movie != null) {
            System.out.println("DVD player playing " + movie);
        } else {
            System.out.println("No movie selected");
        }
    }

    public void pause() {
        System.out.println("DVD player paused");
    }

    public void unpause() {
        System.out.println("DVD player unpaused");
    }

    public void load(String movie) {
        this.movie = movie;
        System.out.println("DVD player loading " + movie);
    }

    public void stop() {
        System.out.println("DVD player stopped");
    }

    public void eject() {
        movie = null;
        System.out.println("DVD player ejecting");
    }
}
