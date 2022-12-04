package pt.utad.mei.aps;

public class Main {
    private static void playGame() {
        Npc player = new Npc("Player One", NpcClass.PLAYER);

        Npc[] enemies = new Npc[3];
        enemies[0] = new Npc("Enemy One", NpcClass.ENEMY);
        enemies[1] = new Npc("Enemy Two", NpcClass.ENEMY);
        enemies[2] = new Npc("Enemy Three", NpcClass.ENEMY);

        for (int i = 0; i < 5; i++) {
            player.move();
            for (Npc enemy : enemies) {
                enemy.move();
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}