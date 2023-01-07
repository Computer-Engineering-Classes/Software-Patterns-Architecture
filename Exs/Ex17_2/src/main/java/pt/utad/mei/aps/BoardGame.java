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

    private static char readChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public String getName() {
        return name;
    }

    public boolean playGame() {
        newGame();
        pickPieces();
        pickPlayers();
        do {
            showScore();
            for (String player : players) {
                playTurn(player);
            }
        } while (!gameOver());
        endGame();
        return playAgain();
    }

    protected abstract void newGame();

    private void pickPieces() {
        System.out.println("Picking " + numberOfPieces + " pieces");
    }

    private void pickPlayers() {
        System.out.println("Picking " + numberOfPlayers + " players");
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add("Player " + (i + 1));
        }
    }

    private void showScore() {
        System.out.println("Showing " + numberOfPlayers + " scores");
    }

    private boolean playAgain() {
        System.out.println("Do you want to play " + name + " again? (y/n)");
        return readChar() == 'y';
    }

    private void endGame() {
        System.out.println("Game over of " + name);
    }

    private void playTurn(String player) {
        System.out.printf("Player '%s': ", player);
        Scanner scanner = new Scanner(System.in);
        String play = scanner.nextLine();
        System.out.printf("Player '%s' played: %s\n", player, play);
    }

    protected abstract boolean gameOver();
}
