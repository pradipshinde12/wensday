package user;

import java.util.List;
import controller.iplcontroller;
import entity.Player;

public class usermain {
    public static void main(String[] args) {
        iplcontroller iplc = new iplcontroller();
        List<Player> players = iplc.getallplayer();

        for (Player p : players) {
            System.out.println(p);
        }

        System.out.println("This is the end of the main method");
    }
}
