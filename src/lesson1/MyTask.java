package lesson1;

public class MyTask {
    public static void main(String[] args) {
        int targetMoney = 15000;
        int weeksInYear = 52;
        int moneyPerWeek = 40;
        int countOfYear = 0;
        for (int i = 0; i <= (15000 / (52 * 40)); i++){
             countOfYear = i;
        }
        System.out.println(countOfYear);
    }
}
