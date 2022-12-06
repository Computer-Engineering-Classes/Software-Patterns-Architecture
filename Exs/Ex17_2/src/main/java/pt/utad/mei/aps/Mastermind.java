package pt.utad.mei.aps;

public class Mastermind extends BoardGame {
    public Mastermind() {
        super("Mastermind", 2, 4);
    }

    @Override
    public void newGame() {
        System.out.println("New game of " + name);
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
        System.out.println("Showing score");
    }

    @Override
    public boolean gameOver() {
        System.out.println("Checking if game is over");
        return true;
    }

    @Override
    public void playTurn() {
        System.out.println("Playing turn of " + name);
    }

    @Override
    public void endGame() {
        System.out.println("Ending game of " + name);
    }

    @Override
    public boolean playAgain() {
        System.out.println("Do you want to play " + name + " again? (y/n)");
        return readChar() == 'y';
    }
}
