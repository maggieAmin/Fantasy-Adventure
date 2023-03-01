package Tool;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {
    Weapon weapon1;
    Weapon weapon2;

    @Before
    public void before(){
        weapon1 = new Weapon("Axe", "A large Axe", 10);
        weapon2 = new Weapon("Sword", "A large Sword", 25);
    }

    @Test
    public void canWeaponHasName(){
        assertEquals("Axe", weapon1.getName());
    }

    @Test
    public void canWeaponHasDescription(){
        assertEquals("A large Axe", weapon1.getDescription());
    }

    @Test
    public void canWeaponHasDamage(){
        assertEquals(10, weapon1.getDamage());
    }

}