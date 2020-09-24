package Game;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Dealer dealer = new Dealer();

        Game game = new Game();
        game.addPlayerToGame(player1);
        game.addPlayerToGame(dealer);

        Deck deck = new Deck();

        System.out.println(deck.getRandomCard());

    }
}
