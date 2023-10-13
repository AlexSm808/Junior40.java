package BlackJack;

import java.util.ArrayList;

public class BlackJack {
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(Koloda koloda) {
        for (Player p : players) { // проходимся по всем игрокам (не важно есть ли там крупье)
            p.addCardToHand(koloda.getRandomCard());
        }
        for (Player p : players) { // проходимся по всем игрокам (не важно есть ли там крупье)
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    // метод который будет раздавать все нужные карты всем игрокам
    // пока не скаэут что им они не нужны
    public void dealAllNeedCards(Koloda koloda) {
        for (Player p : players) { //  прохожусь по всем игрокам и крупье
            while (p.needMoreCards()) { //!!!!  программа динамически подстраивается какой
                //!!!! тип объекта она взяла. И вызывает именно тот метод needMoreCards
                //!!!! в зависимости от того какой это объект
                // !!!!! ПРОЯВЛЕНИЕ ПОЛИМОРФИЗМА
                p.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    public void printWinner() {
        /**
         * 24   26   25   27 - у всех перебор, победил крупье !!!
         * 24   18   25   25 - победил тот, у кого недобор (18) !!!
         * 21   21   21   27 - победили три человека
         * 18   18   25   12 - победили 2 у кого ближе к 21
         * 12   12   13   14 - победил 14
         */

        for (Player p : players) { // проходимся, устанавливаем флаг False тем, кто не может претендовать
            // на победу
            if (p.countBallInHand() > 21) {
                p.setCanWin(false);
            }
        }
        // Если у всех перебор то выиграл крупье
        if (countPlayersWhoCanWinn() == 0) {
            for (Player p : players) {
                if (p instanceof Dealer) {
                    System.out.println("Победил крупье!!! Его карты ");
                    p.openHand();
                    return;
                }
            }
        }

        // Если в игре остался только один
        if (countPlayersWhoCanWinn() == 1) {
            for (Player p : players){
                if(p.isCanWin()){
                    System.out.println("Выиграл " + p.getName() + " Его карты: ");
                    p.openHand();
                    return;
                }
            }
        }

        int ballWinner = -1; // 12 -- 16  --- 19
        for (Player p : players) { // 26   12   16   19
            if (p.isCanWin() && p.countBallInHand() > ballWinner) {
                ballWinner = p.countBallInHand();
            }
        }

        // узнали бал победителя и печатаем тех игроков, у кого такой бал (их может быть несколько)
        for (Player p : players) {
            if (p.countBallInHand() == ballWinner) {
                System.out.println("Победитель " + p.getName() + "! Его карты: ");
                p.openHand();
            }
        }
    }

    private int countPlayersWhoCanWinn(){
        int count = 0;
        for(Player p : players){
            if(p.isCanWin()){
                count++;
            }
        }
        return count;
    }
}