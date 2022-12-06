package pt.utad.mei.aps;

public class Checkers extends BoardGame {
    public Checkers() {
        super("Checkers", 2, 32);
    }

    @Override
    public void newGame() {
        System.out.println("Starting a new game of " + name);
    }

    @Override
    public void pickPieces() {
        System.out.println("Picking " + numberOfPieces + " pieces");
    }

    @Override
    public void pickPlayers() {
        System.out.println("Picking " + numberOfPlayers + " players");
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add("Player " + (i + 1));
        }
    }

    @Override
    public void showScore() {
        System.out.println("Showing " + numberOfPlayers + " scores");
    }

    @Override
    public boolean gameOver() {
        return true;
    }

    @Override
    public void playTurn() {
        System.out.println("Playing a turn of " + name);
    }

    @Override
    public void endGame() {
        System.out.println("Game over of " + name);
    }

    @Override
    public boolean playAgain() {
        System.out.println("Do you want to play " + name + " again? (y/n)");
        return readChar() == 'y';
    }
}
