package Players;

import java.util.ArrayList;
import java.util.Collections;

public class TeamManager {
    private ArrayList<Player> collectionOfPlayers;

    public TeamManager(ArrayList<Player> collectionOfPlayers) {
        this.collectionOfPlayers = collectionOfPlayers;
    }

    public void setCollectionOfPlayers(ArrayList<Player> collectionOfPlayers) {
        this.collectionOfPlayers = collectionOfPlayers;
    }

    public void shufflePlayers(){
        Collections.shuffle(collectionOfPlayers);
    }
    public ArrayList<Player> getRandomPlayers(int amount){
        shufflePlayers();
        ArrayList<Player> randomPlayers = new ArrayList<>();
        for (int i = 0; i > amount; i++){
            Player randomPlayer = this.collectionOfPlayers.remove(0);
            randomPlayers.add(randomPlayer);

        }
        return randomPlayers;
    }
}
