package pt.utad.mei.aps;

public class EnemyBot extends Npc {

    private final String clothes;
    private final int intelligence;
    private final float speed;

    public EnemyBot(EnemyBot target) {
        this.clothes = target.getClothes();
        this.intelligence = target.getIntelligence();
        this.speed = target.getSpeed();
    }

    public EnemyBot(String clothes, int intelligence, float speed) {
        this.clothes = clothes;
        this.intelligence = intelligence;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnemyBot enemyBot = (EnemyBot) o;
        return getIntelligence() == enemyBot.getIntelligence()
                && Float.compare(enemyBot.getSpeed(), getSpeed()) == 0
                && getClothes().equals(enemyBot.getClothes());
    }


    public String getClothes() {
        return clothes;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public float getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "EnemyBot{" +
                "clothes='" + clothes + '\'' +
                ", intelligence=" + intelligence +
                ", speed=" + speed +
                '}';
    }

    @Override
    public Npc clone() {
        return new EnemyBot(this);
    }
}
