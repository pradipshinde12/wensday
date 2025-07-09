package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Player;

public class ipldao {

    public List<Player> getallplayer() {
        List<Player> players = new ArrayList<>();

        String url = "jdbc:mysql://localhost:3306/jdbc_db"; // your DB name
        String username = "root"; // your DB username
        String password = "pradip@123"; // your DB password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM player");

            // Process result set
            while (rs.next()) {
                int pid = rs.getInt("pid");
                int js = rs.getInt("jn");
                String pname = rs.getString("pname");
                int runs = rs.getInt("runs");
                int wickets = rs.getInt("wickets");
                String tname = rs.getString("tname");

                Player p = new Player(pid, js, pname, runs, wickets, tname);
                players.add(p);
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return players;
    }
}
