package Players;

import Tool.HealingTools;

import java.util.ArrayList;

public class Clerics extends Player {

    private ArrayList<HealingTools> healingTools;

    public Clerics(int healthPoints, ArrayList<HealingTools> healingTools) {
        super(healthPoints);
        this.healingTools = healingTools;
    }

    public ArrayList<HealingTools> getHealingTools() {
        return healingTools;
    }
}
