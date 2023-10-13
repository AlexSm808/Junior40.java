package lesson2;

public class zadanie3 {
    public static void main(String[] args) {
        // Вывести на консоль сумму четных чисел от 10 до 40
        int summ = 0;
        for (int i = 10; i <= 40; i += 2) {
            summ = summ + i;
        }
        System.out.println(summ);
    }
}
