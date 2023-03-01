package Room;

import Enemies.Enemies;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RoomTest {

    Room room1;
    Room room2;

    Enemies enemies1;
    Enemies enemies2;

    Player players1;
    Player players2;

    ArrayList<Enemies> enemiesList1;




    @Before
    public void before() {
        enemies1 = new Enemies(20, 10, "Orc");
        enemies2 = new Enemies(15, 5, "Goblin");

        enemiesList1 = new ArrayList<Enemies>();
        enemiesList1.add(enemies1);
        enemiesList1.add(enemies2);
        room1 = new Room("Level1", enemiesList1,"Club fight", "Gold");
    }

    @Test
    public void canGetName() {
        assertEquals("Level1", room1.getName());
    }

    @Test
    public void canGetEnemies() {
        assertEquals(enemiesList1, room1.getEnemies());
    }

    @Test
    public void canGetFight() {
        assertEquals("Club fight", room1.getFight());
    }

    @Test
    public void canGetTreasure() {
        assertEquals("Gold", room1.getTreasure());
    }
}