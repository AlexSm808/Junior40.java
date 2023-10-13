package BlackJack;

public class Main {
    public static void main(String[] args) {
        Koloda koloda = new Koloda();
        koloda.prepared();

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Dealer dealer = new Dealer();

        player1.setName("Vasya");
        player2.setName("Petya");
        player3.setName("Ruslan");

        BlackJack BlackJack = new BlackJack();
        BlackJack.addPlayerToGame(player1);
        BlackJack.addPlayerToGame(player2);
        BlackJack.addPlayerToGame(player3);
        BlackJack.addPlayerToGame(dealer);

        BlackJack.dealTwoCardsToAllPlayers(koloda);
        BlackJack.dealAllNeedCards(koloda);
        System.out.println();
        BlackJack.printWinner();
    }
}
