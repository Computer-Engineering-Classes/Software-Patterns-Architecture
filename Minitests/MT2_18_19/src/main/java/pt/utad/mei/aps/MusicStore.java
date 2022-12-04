package pt.utad.mei.aps;

import java.util.ArrayList;

public class MusicStore {
    private final ArrayList<Listener> listeners;
    private final ArrayList<String> songs;

    public MusicStore() {
        this.listeners = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        for (Listener listener : listeners) {
            listener.update("New song: " + song);
        }
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    public void listSongs() {
        for (String song : songs) {
            System.out.println(song);
        }
    }
}
