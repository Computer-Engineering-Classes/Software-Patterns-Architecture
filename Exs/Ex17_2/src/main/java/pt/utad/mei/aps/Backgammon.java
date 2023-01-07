package pt.utad.mei.aps;

public class Backgammon extends BoardGame {
    public Backgammon() {
        super("Backgammon", 2, 15);
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
