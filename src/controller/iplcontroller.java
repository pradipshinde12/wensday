package controller;

import java.util.List;
import services.iplservices;
import entity.Player;

public class iplcontroller {
	// task is that to  fetch the batter from the all the  table and  bolwer

    public List<Player> getallplayer() {
        iplservices iplserv = new iplservices();

        List<Player> players = iplserv.getallplayer();

        System.out.println("This is IPL controller method");
        return players;
    }
}
