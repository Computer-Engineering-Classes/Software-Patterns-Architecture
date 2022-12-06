package pt.utad.mei.aps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class BoardGame {
    protected final String name;
    protected final int numberOfPlayers;
    protected final int numberOfPieces;
    protected final List<String> players;

    public BoardGame(String name, int numberOfPlayers, int numberOfPieces) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfPieces = numberOfPieces;
        this.players = new ArrayList<>();
    }

    public boolean playGame() {
        newGame();
        pickPieces();
        pickPlayers();
        do {
            showScore();
            playTurn();
        } while (!gameOver());
        endGame();
        return playAgain();
    }

    public abstract void newGame();

    public abstract void pickPieces();

    public abstract void pickPlayers();

    public abstract void showScore();

    public abstract boolean gameOver();

    public abstract void playTurn();

    public abstract void endGame();

    public abstract boolean playAgain();

    public String getName() {
        return name;
    }

    protected char readChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
