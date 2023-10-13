package lesson2;

import java.util.Scanner;

public class Ptactica {
    public static void main(String[] args) {
        // Пользователь вводит название месяца, вывести на консоль время года согласно введенному месяцу
        // Если введено не верно либо такого месяца не существует, то вывести на экран "несуществующие время года
        // Сделать это при помощи if else, а потом с помощью switch () {case]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц");
        String nameOfMonth = scanner.nextLine();
        if (nameOfMonth.equals("Январь") || nameOfMonth.equals("Февраль") || nameOfMonth.equals("Декабрь")) {
            System.out.println("Зима");
        } else if (nameOfMonth.equals("Март") || nameOfMonth.equals("Апрель") || nameOfMonth.equals("Май")) {
            System.out.println("Весна");
        } else if (nameOfMonth.equals("Июнь") || nameOfMonth.equals("Июль") || nameOfMonth.equals("Август")) {
            System.out.println("Лето");
        } else if (nameOfMonth.equals("Сентябрь") || nameOfMonth.equals("Октябрь") || nameOfMonth.equals("Ноябрь")) {
            System.out.println("Осень");
        }
        else {System.out.println("Несуществующее время года");

        }
    }
}
