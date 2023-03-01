package Players;

import Tool.HealingTools;
import Tool.Spells;
import Tool.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClericsTest {
    Clerics cleric1;
    HealingTools healingTool1;
    HealingTools healingTool2;
    ArrayList<HealingTools> healingToolsList1;


    @Before
    public void before(){
        healingTool1 = new HealingTools("Magic stick", "Only touch from it can return you from death", 50);
        healingTool2 = new HealingTools("Holy oil", "It can heal the injuries", 20);
        healingToolsList1 = new ArrayList<>();
        healingToolsList1.add(healingTool1);
        healingToolsList1.add(healingTool2);
        cleric1 = new Clerics(30, healingToolsList1);
    }

    @Test
    public void canHasHealingTools() {
        assertEquals(healingToolsList1, cleric1.getHealingTools());
    }
}