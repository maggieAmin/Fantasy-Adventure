package Tool;

public class HealingTools extends Tool{

    private int healingPower;

    public HealingTools(String name, String description, int healingPower) {
        super(name, description);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
