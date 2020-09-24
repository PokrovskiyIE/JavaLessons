package Lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class MainCoin {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(new Coin("Gold", 1900, 10, 2.5));
        coins.add(new Coin("Gold", 1900, 10, 3.5));
        coins.add(new Coin("Silver", 1980, 5, 2));
        coins.add(new Coin("Bronze", 1800, 1, 3));
        coins.add(new Coin("Gold", 1950, 2, 2.5));

        for (Coin coin: coins) {
            System.out.println(coin);
        }
    }
}
