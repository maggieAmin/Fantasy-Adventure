package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemiesTest {

    Enemies enemies;

    @Before
    public void before(){
        enemies = new Enemies(10, 5, "Goblin");
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(10, enemies.getHealthPoints());

    }

    @Test
    public void canGetKillingPower() {
        assertEquals(5, enemies.getKillingPower());
    }

    @Test
    public void canHasName(){
        assertEquals("Goblin", enemies.getName());
    }
}