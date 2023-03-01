package Tool;

public class Spells extends Tool{

    private int damage;

    public Spells(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
