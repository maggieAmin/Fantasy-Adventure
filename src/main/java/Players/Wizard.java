package Players;

import Tool.Creatures;
import Tool.Spells;

import java.util.ArrayList;

public class Wizard extends Player {

    private ArrayList<Spells> spells;
    private ArrayList<Creatures> creatures;

    public Wizard(int healthPoints, ArrayList<Spells> spells, ArrayList<Creatures> creatures) {
        super(healthPoints);
        this.spells = spells;
        this.creatures = creatures;
    }

    public ArrayList<Spells> getSpells() {
        return spells;
    }

    public ArrayList<Creatures> getCreatures() {
        return creatures;
    }
}
