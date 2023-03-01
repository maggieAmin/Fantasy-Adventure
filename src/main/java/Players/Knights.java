package Players;

import Tool.Weapon;

import java.util.ArrayList;

public class Knights extends Player {
    private ArrayList<Weapon> weapons;
    private String armour;

    public Knights(int healthPoints, ArrayList<Weapon> weapons, String armour) {
        super(healthPoints);
        this.weapons = weapons;
        this.armour = armour;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public String getArmour() {
        return armour;
    }

}
