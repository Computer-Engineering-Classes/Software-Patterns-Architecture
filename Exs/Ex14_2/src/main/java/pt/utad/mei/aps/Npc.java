package pt.utad.mei.aps;

import java.util.Random;

public class Npc {
    private final String name;
    private final String[] animations;
    private final NpcClass npcClass;
    private double x;
    private double y;
    private int currentAnimation;

    public Npc(String name, NpcClass npcClass) {
        this.currentAnimation = 0;
        this.name = name;
        this.npcClass = npcClass;
        this.animations = AnimationsFactory.getAnimations(npcClass);
        Random random = new Random();
        this.x = random.nextDouble(100);
        this.y = random.nextDouble(100);
    }

    public void move() {
        Random random = new Random();
        this.x = random.nextDouble(-2, 2);
        this.y = random.nextDouble(-2, 2);
        System.out.printf("%s: %s moved to (%.2f, %.2f)%n", this.npcClass, this.name, this.x, this.y);
        animate();
    }

    private void animate() {
        System.out.printf("%s: %s is %s%n", this.npcClass, this.name, this.animations[this.currentAnimation]);
        if (this.currentAnimation == this.animations.length - 1) {
            this.currentAnimation = 0;
        } else {
            this.currentAnimation++;
        }
    }
}
