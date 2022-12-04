package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore();

        var radioStation = new RadioStation("RFM");
        var radioStation2 = new RadioStation("RTP");

        musicStore.addListener(radioStation);
        musicStore.addListener(radioStation2);

        musicStore.addSong("Song 1");
        musicStore.addSong("Song 2");

        musicStore.removeSong("Song 1");
        musicStore.removeListener(radioStation);

        musicStore.addSong("Song 3");

        musicStore.listSongs();
    }
}