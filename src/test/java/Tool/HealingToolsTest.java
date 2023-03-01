package Tool;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HealingToolsTest {

    HealingTools healingTool1;

    @Before
    public void before(){
        healingTool1 = new HealingTools("Potion", "A healing potion", 30);
    }

    @Test
    public void getHealingPower() {
        assertEquals(30, healingTool1.getHealingPower());
    }

    @Test
    public void canHealingPowerHasName(){
        assertEquals("Potion", healingTool1.getName());
    }

    @Test
    public void canHealingPowerHasDescription(){
        assertEquals("A healing potion", healingTool1.getDescription());
    }
}