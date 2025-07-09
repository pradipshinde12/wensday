package services;

import java.util.List;
import dao.ipldao;
import entity.Player;

public class iplservices {

    public List<Player> getallplayer() {
        System.out.println("This is the IPL services method");

        ipldao id = new ipldao();
        List<Player> players = id.getallplayer();

        return players;
    }
}
