package lesson1;

import javax.sound.midi.Soundbank;

public class Main1 {
    public static void main(String[] args) {
        //задача
        int money = 1000;
        int priceOfSnikers = 35;
        double priceOfCandy = 3.5;

        int countSnikersCanBuy = money / priceOfSnikers;
        int restOfMoneyAfterSnikersBuy = money % priceOfSnikers;
        int countCandyBuy = (int) (restOfMoneyAfterSnikersBuy / priceOfCandy);
        double restOfMoney = (restOfMoneyAfterSnikersBuy % priceOfCandy);
        System.out.println(countSnikersCanBuy);
        System.out.println(countCandyBuy);
        System.out.println(restOfMoney);
        

    }
}
