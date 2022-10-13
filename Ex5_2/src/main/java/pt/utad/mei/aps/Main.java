package pt.utad.mei.aps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var enemies = new ArrayList<Npc>();

        var enemyBot = new EnemyBot(
                "Tricorne,Frock coat,Breeches,Cavalier boots",
                100, 5.5f
        );

        for (int i = 0; i < 10; i++) {
            enemies.add(enemyBot.clone());
        }

        for (int i = 0; i < enemies.size(); i++) {
            System.out.printf("[%s] -> %s\n", i, enemies.get(i));
        }
    }
}