package Game;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players = new ArrayList<Player>();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }
}
