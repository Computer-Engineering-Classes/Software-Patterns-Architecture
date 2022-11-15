package pt.utad.mei.aps;

public class Remote {
    private final Tuner tuner;
    private final DvdPlayer dvdPlayer;
    private final Amplifier amplifier;
    private final Tv tv;

    public Remote(Tuner tuner, DvdPlayer dvdPlayer, Amplifier amplifier, Tv tv) {
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.tv = tv;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.on();
        tv.setInput(dvdPlayer.toString());
        dvdPlayer.on();
        dvdPlayer.load(movie);
        dvdPlayer.play();
        dvdPlayer.pause();
        tv.setVolume(25);
        dvdPlayer.unpause();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        tv.off();
    }

    public void watchChannel(String channel) {
        System.out.println("Get ready to watch a channel...");
        amplifier.on();
        amplifier.setInput(tv.toString());
        tv.on();
        tv.setVolume(20);
        tv.changeChannel(channel);
        tv.off();
        amplifier.off();
    }

    public void listenToRadio(double frequency, Modulation modulation) {
        System.out.println("Get ready to listen to the radio...");
        tuner.on();
        switch (modulation) {
            case AM -> tuner.setAm();
            case FM -> tuner.setFm();
        }
        tuner.setFrequency(frequency);
        tuner.off();
    }
}
