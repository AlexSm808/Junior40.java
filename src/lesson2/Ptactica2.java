package lesson2;

import java.util.Scanner;

public class Ptactica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц");
        String nameOfMonth = scanner.nextLine();
        switch (nameOfMonth) {
            case "Январь":
                System.out.println("Зима");
                break;
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Декабрь":
                System.out.println("Зима");
                break;
            case "Март":
                System.out.println("Весна");
                break;
            case "Апрель":
                System.out.println("Весна");
                break;
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
                System.out.println("Лето");
                break;
            case "Июль":
                System.out.println("Лето");
                break;
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
                System.out.println("Осень");
                break;
            case "Октябрь":
                System.out.println("Осень");
                break;
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
