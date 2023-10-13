package lesson2;

import java.util.Scanner;

public class Samopal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int numberOfMonth = scanner.nextInt();
        switch (numberOfMonth) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
