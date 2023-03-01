package Tool;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CreaturesTest {

    Creatures creature1;
    Creatures creature2;

    @Before
    public void  before(){
        creature1 = new Creatures("Troll","A large creature", 5, 20);
        creature2 = new Creatures("Mermaid","A creature with a fishy tale", 3, 15);
    }

    @Test
    public void getDamage() {
        assertEquals(5, creature1.getDamage());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(20, creature1.getHealthPoints());
    }

    @Test
    public void setDamage() {
        creature2.setDamage(4);
        assertEquals(4, creature2.getDamage());
    }

    @Test
    public void setHealthPoints() {
    }
}