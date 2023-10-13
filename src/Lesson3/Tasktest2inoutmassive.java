package Lesson3;

import java.util.Scanner;

public class Tasktest2inoutmassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        System.out.println("Введите количество элементов массива *не больше 10*: ");
        int n = scanner.nextInt();
        int[] newArray = new int[n];
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Введите значение элемента массива с индексом [" + i + "]");
            newArray[i] = scanner.nextInt();
        }
        System.out.println("Введите номер от 1 до " + n);
        String numOfArray = string.nextLine();
        switch (numOfArray) {
            case "1":
                System.out.println("Значение первого контейнера = " + newArray[0]);
                break;
            case "2":
                System.out.println("Значение первого контейнера = " + newArray[1]);
                break;
            case "3":
                System.out.println("Значение первого контейнера = " + newArray[2]);
                break;
            case "4":
                System.out.println("Значение первого контейнера = " + newArray[3]);
                break;
            case "5":
                System.out.println("Значение первого контейнера = " + newArray[4]);
                break;
            case "6":
                System.out.println("Значение первого контейнера = " + newArray[5]);
                break;
            case "7":
                System.out.println("Значение первого контейнера = " + newArray[6]);
                break;
            case "8":
                System.out.println("Значение первого контейнера = " + newArray[7]);
                break;
            case "9":
                System.out.println("Значение первого контейнера = " + newArray[8]);
                break;
            case "10":
                System.out.println("Значение первого контейнера = " + newArray[9]);
                break;
            default:
                System.out.println("Недопустимое значение");

            }

//        for (int j = 0; j < newArray.length; j++) {
//            System.out.println(newArray[j]);
//        }
    }
}