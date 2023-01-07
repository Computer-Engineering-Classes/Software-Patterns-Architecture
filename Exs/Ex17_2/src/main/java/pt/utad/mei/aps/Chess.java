package pt.utad.mei.aps;

public class Chess extends BoardGame {
    public Chess() {
        super("Chess", 2, 32);
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
