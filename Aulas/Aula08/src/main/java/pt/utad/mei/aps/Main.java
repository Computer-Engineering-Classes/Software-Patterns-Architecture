package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        var tuner = new Tuner();
        var dvdPlayer = new DvdPlayer();
        var amplifier = new Amplifier();
        var tv = new Tv();

        var remote = new Remote(tuner, dvdPlayer, amplifier, tv);

        remote.watchMovie("The Thing");
        System.out.print('\n');
        remote.watchChannel("SyFy");
        System.out.print('\n');
        remote.listenToRadio(106.2, Modulation.FM);
    }
}