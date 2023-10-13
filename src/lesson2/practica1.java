package lesson2;

import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму денег");
        int money = scanner.nextInt();

        if (money >= 1000){
            System.out.println("Идем  дорогой ресторан");
        }
        else if (money >= 100){
            System.out.println("Идем в кафе");
        }
        else if (money >= 10) {
            System.out.println("Идём в столовую");
        }
        else {
            System.out.println("Усердно работаем");
        }
    }
}
