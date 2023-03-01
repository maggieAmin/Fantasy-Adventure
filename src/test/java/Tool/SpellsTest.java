package Tool;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpellsTest {

    Spells spell1;
    Spells spell2;

    @Before
    public void before() {
        spell1 = new Spells("Fireball", "A burning spell", 50);
    }

    @Test
    public void getDamage() {
        assertEquals(50, spell1.getDamage());
    }

    @Test
    public void canSpellHasName(){
        assertEquals("Fireball", spell1.getName());
    }

    @Test
    public void canSpellHasDescription(){
        assertEquals("A burning spell", spell1.getDescription());
    }
}