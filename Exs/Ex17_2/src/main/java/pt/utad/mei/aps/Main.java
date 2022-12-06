package pt.utad.mei.aps;

public class Main {
    private static void playTest(BoardGame game) {
        System.out.println("Playing " + game.getName());
        while (game.playGame()) {
            System.out.println("Playing again");
        }
    }

    public static void main(String[] args) {
        playTest(new Chess());
        playTest(new Checkers());
        playTest(new Backgammon());
        playTest(new Mastermind());
        playTest(new Ludo());
    }
}