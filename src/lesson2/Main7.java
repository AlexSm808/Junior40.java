package lesson2;

public class Main7 {
    public static void main(String[] args) {
        // Задача: сколько мы заберем денег с банка,
        //если оставим 10 000 рублей на 7 лет, под 9% годовых
        // помесячная капитализация
        double money = 10000;
        int year = 5;
        int percent = 9;
        for (int month = 0; month <= year * 12; month++){
            money = money + ((money/100*percent) / 12);
                    }
        System.out.println(money);
    }
}
