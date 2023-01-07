package pt.utad.mei.aps;

public class Mastermind extends BoardGame {
    public Mastermind() {
        super("Mastermind", 2, 4);
    }

    @Override
    protected void newGame() {
        System.out.println("New game of " + name);
    }

    @Override
    protected boolean gameOver() {
        System.out.println("Checking if game is over");
        return true;
    }
}