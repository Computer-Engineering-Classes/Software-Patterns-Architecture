package pt.utad.mei.aps;

import java.util.Map;

public class AnimationsFactory {
    private static final Map<NpcClass, String[]> animations = Map.of(
            NpcClass.PLAYER, new String[]{"player1.png", "player2.png", "player3.png", "player4.png"},
            NpcClass.ENEMY, new String[]{"enemy1.png", "enemy2.png", "enemy3.png", "enemy4.png"}
    );

    public static String[] getAnimations(NpcClass npcClass) {
        return animations.get(npcClass);
    }
}
