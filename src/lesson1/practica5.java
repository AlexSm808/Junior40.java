package lesson1;

import java.util.Scanner;

public class practica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        if ((a < b) || (a < 100)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
