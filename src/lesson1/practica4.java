package lesson1;

import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = scanner.nextInt();
        int unit = a % 10;
        int dec = (a % 100)/10;
        int cent = a / 100;
        System.out.println("Вес числа: " + (unit + dec + cent));


    }
}
