package Players;

import Tool.Creatures;
import Tool.Spells;
import Tool.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard1;
    Wizard wizard2;
    Creatures creature1;
    Spells spell1;
    ArrayList<Creatures> creaturesList1;
    ArrayList<Spells> spellsList1;

    @Before
    public void before(){
        creature1 = new Creatures("Troll","A large creature", 5, 20);
        creaturesList1 = new ArrayList<>();
        creaturesList1.add(creature1);
        spell1 = new Spells("Fireball", "A burning spell", 50);
        spellsList1 = new ArrayList<>();
        spellsList1.add(spell1);
        wizard1 = new Wizard(9, spellsList1, creaturesList1);

    }

    @Test
    public void canGetSpells() {
        assertEquals(spellsList1, wizard1.getSpells());
    }

    @Test
    public void canGetCreatures() {
        assertEquals(creaturesList1, wizard1.getCreatures());
    }
}