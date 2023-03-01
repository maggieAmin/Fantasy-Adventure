package Players;

import Tool.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class KnightsTest {

    Knights knight1;
    Knights knight2;
    Knights knight3;
    Weapon weapon1;
    Weapon weapon2;
    Weapon weapon3;
    Weapon weapon4;
    ArrayList<Weapon> weaponsList1 = null;
    ArrayList<Weapon> weaponsList2;

    @Before
    public void before(){
        weapon1 = new Weapon("Axe", "A large Axe", 10);
        weapon2 = new Weapon("Sword", "A large Sword", 25);
        weaponsList1 = new ArrayList<>();
        weaponsList1.add(weapon1);
        weaponsList1.add(weapon2);
        knight1 = new Knights(10, weaponsList1, "Shield");

        weapon3 = new Weapon("Hummer", "A large hummer", 7);
        weapon4 = new Weapon("Knife", "A large knife", 3);
        weaponsList2 = new ArrayList<>();
        weaponsList2.add(weapon3);
        weaponsList2.add(weapon4);
        knight2 = new Knights(13, weaponsList2, "Helmet");
    }

    @Test
    public void canGetWeapons() {
        assertEquals(weaponsList1, knight1.getWeapons());
        assertEquals(weaponsList2, knight2.getWeapons());
    }

    @Test
    public void canGetArmour() {
        assertEquals("Helmet", knight2.getArmour());
    }
}