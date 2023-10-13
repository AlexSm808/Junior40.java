package Lesson3;

import java.util.Scanner;

public class Tsker {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("Введите значение элемента массива с индексом [" + i + "]");
        }
    }
}
