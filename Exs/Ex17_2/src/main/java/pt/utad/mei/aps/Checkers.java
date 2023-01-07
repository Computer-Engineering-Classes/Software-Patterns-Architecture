package pt.utad.mei.aps;

public class Checkers extends BoardGame {
    public Checkers() {
        super("Checkers", 2, 32);
    }

    @Override
    protected void newGame() {
        System.out.println("Starting a new game of " + name);
    }

    @Override
    protected boolean gameOver() {
        return true;
    }
}
