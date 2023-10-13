package lesson1;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Периметр треугольника равен - P = a+b+c");
        System.out.println("Введите число первую сторону треугольника ");
        double a = scanner.nextDouble();
        System.out.println("Введите число вторую сторону треугольника ");
        double b = scanner.nextDouble();
        System.out.println("Введите число третью сторону треугольника ");
        double c = scanner.nextDouble();
        double perimetrTriangle = a + b + c;
        System.out.println("Периметр треугольника равен - " + perimetrTriangle);

    }
}
