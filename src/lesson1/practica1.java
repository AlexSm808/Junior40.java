package lesson1;

import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        if (login.equals("admin")) {
            if (password.equals("123")) {
                System.out.println("OK");
            } else
                System.out.println("Password is wrong");

        } else {
            System.out.println("Login is wrong");
        }

    }
}