package Room;

import Enemies.Enemies;

import java.util.ArrayList;

public class Room {

    private String name;
    private ArrayList<Enemies> enemies;
    private String fight;
    private String treasure;

    public Room(String name, ArrayList<Enemies> enemies, String fight, String treasure) {
        this.name = name;
        this.enemies = enemies;
        this.fight = fight;
        this.treasure = treasure;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Enemies> getEnemies() {
        return enemies;
    }

    public String getFight() {
        return fight;
    }

    public String getTreasure() {
        return treasure;
    }
}
