package pt.utad.mei.aps;

public class Ludo extends BoardGame {
    public Ludo() {
        super("Ludo", 4, 4);
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
