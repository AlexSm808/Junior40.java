package lesson2;

public class Main8 {
    public static void main(String[] args) {
        // посчитать и вывести на консоль сколько секунд в сутках
        int summOfSeconds = 0;
        for (int i = 0; i <= 24 * 60 * 60; i++) {
        summOfSeconds = i;
        }
        System.out.println(summOfSeconds);
    }
}