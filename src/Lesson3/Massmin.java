package Lesson3;

import java.util.Scanner;

public class Massmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[7];
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Введите значение элемента массива с индексом [" + i + "]");
            newArray[i] = scanner.nextInt();
        }
        int min = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
        }
        System.out.println(min);
    }
}