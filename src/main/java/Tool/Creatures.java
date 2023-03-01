package Tool;

public class Creatures extends Tool{

    private int damage;
    private int healthPoints;

    public Creatures(String name, String description, int damage, int healthPoints) {
        super(name, description);
        this.damage = damage;
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
