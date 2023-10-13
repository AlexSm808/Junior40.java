package lesson1;

import java.util.Scanner;

public class practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a > 100 && a % 2 == 0) {
            System.out.println("OK");
        } else{
            System.out.println("ERORR");
        }

    }
}
