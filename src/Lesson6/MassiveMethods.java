package Lesson6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class MassiveMethods {
    // Метод принимает входящими параметрами двухмерный массив с числами.
    // И возвращает из метода кол-во четных чисел в двухмерном массиве.
    public static int arrayEvens(int[][] arrayNums) {
        int arrayEvens = 0;
        for (int i = 0; i < arrayNums.length; i++) {
            for (int j = 0; j < arrayNums[i].length; j++) {
                if (arrayNums[i][j] % 2 == 0)
                    arrayEvens++;
            }
        }
        return arrayEvens;
    }

    public static void lessNumber(double a, double b, double c, double d, double e) {
        //метод принимает входящим параметром 5 чисел, и печатает на консоль меньшее из них
        double lessNumber = 0;
        if (a <= b && a <= c && a <= d && a <= e) {
            lessNumber = a;
        } else if (b <= a && b <= c && b <= d && b <= e) {
            lessNumber = b;
        } else if (c <= a && c <= b && c <= d && c <= e) {
            lessNumber = c;
        } else if (d <= a && d <= b && d <= c && d <= e) {
            lessNumber = d;
        } else {
            lessNumber = e;
        }
        System.out.println(lessNumber);
    }

    public static int[] fillArray(int[] array) {
        //метод принимает входящим параметром одномерный массив чисел.
        // Метод заполняет данный массив любыми числами рандомно, и возвращает заполненный массив
        Random rClass = new Random();
        array = rClass.ints().limit(array.length).toArray();
        return array;
    }

    public static String month(int numberOfMonth) {
        // метод принимает входящим параметром цифру от 1 до 12,
        // и возвращает слово - эквивалент месяца
        String month = null;
        switch (numberOfMonth) {
            case 1:
                month = "Январь";
                break;
            case 2:
                month = "Февраль";
                break;
            case 3:
                month = "Март";
                break;
            case 4:
                month = "Апрель";
                break;
            case 5:
                month = "Май";
                break;
            case 6:
                month = "Июнь";
                break;
            case 7:
                month = "Июль";
                break;
            case 8:
                month = "Август";
                break;
            case 9:
                month = "Сентябрь";
                break;
            case 10:
                month = "Октябрь";
                break;
            case 11:
                month = "Ноябрь";
                break;
            case 12:
                month = "Декабрь";
                break;
            default:
                month = "Нет такого месяца";
        }
        return month;
    }

    public static void isRealTriangle(int side1, int side2, int side3) {
        //метод принимает 3 стороны треугольника. И пишет на консоль это реальный треугольник или нет.
        if ((side3 < (side1 + side2)) && (side2 < (side1 + side3)) && (side1 < (side2 + side3))) {
            System.out.println("Это реальный треугольник");
        } else
            System.out.println("Это нереальный  треугольник");
    }
}