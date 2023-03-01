package Game;

import Players.Player;

import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Player> players;
    private int capacity;

    public Game(String name, ArrayList<Player> players, int capacity) {
        this.name = name;
        this.players = players;
        this.capacity = capacity;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
