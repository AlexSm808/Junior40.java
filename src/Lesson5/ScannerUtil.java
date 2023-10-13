package Lesson5;

import java.util.Scanner;

public class ScannerUtil {
    /**
     * 1 - модификатор  доступа (public, private, protected, _______ - пакетный)
     * (слово определяющее видимость данного метода)
     * public - видимость внутри всего проекта
     * private - видимость внутри текущего класса
     * protected - видимость внутри текущего класса и его наследником (его дочерним классам)
     * ______ - видимость внутри пакета (паектная видимость, видимость внутри текущей папки)
     * <p>
     * <p>
     * 2 - static (пишется или нет)
     * static - метод общий, вызывается у названия класса
     * если static отсутствует - данный метод вызывается у определенного объекта
     * <p>
     * 3 - возвращаемый тип (или слово, если такого нет)
     * 4 - название метода с маленькой буквы
     * 5 - входящие параметры, в круглых скобках через запятую с указанием типа и названия
     * 6 - тело метода (то что будет происходить при вызове данного метода)
     */

    public static String getLevel() {
        System.out.println("Выберите уровень ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");
        //формула создания любого ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();
        return level;
    }

    public static void pringField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printFigurs() {
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Овал");
        System.out.println("3 - Прямоугольник");
        System.out.println("4 - Треугольник");
        System.out.println("5 - Квадрат");
        System.out.println("6 - Трапеция");
    }

    public static String getInputFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фигуру: ");
        String input = scanner.next();
        if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")
                || input.equals("6") || input.equalsIgnoreCase("Круг") || input.equalsIgnoreCase("Овал")
                || input.equalsIgnoreCase("Прямоугольник") || input.equalsIgnoreCase("Треугольник") ||
                input.equalsIgnoreCase("Квадрат") || input.equalsIgnoreCase("Трапеция")) {
            return input;
        } else {
            System.out.println("Неверный ввод, повторите");
            return getInputFigure(); // когда метод вызывает сам себя столько раз, пока пользователь верно не вобьет фигуру
        }
    }

    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Площадь или периметр?");
        String input = scanner.next();
        if (input.equalsIgnoreCase("Площадь") || input.equalsIgnoreCase("Периметр")) {
            return input;
        } else {
            System.out.println("Неверный ввод, повторите");
            return getAction(); // когда метод вызывает сам себя столько раз, пока пользователь верно не вобьет фигуру
        }
    }

    public static int getParametr(String messageToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messageToUser);
        String input = scanner.next();
        int inputValue = Integer.parseInt(input);
        if ((isNumeric(input)) && inputValue > 0) {
            // конвертация String to int
            // проверка на минусовое значение
            return inputValue;
        } else if (inputValue <= 0) {
            System.out.println("Вы ввели недопустимое число !!! Повторите");
            return getParametr(messageToUser);
        } else {
            System.out.println("Вы ввели не число !!! Повторите");
            return getParametr(messageToUser); // когда метод вызывает сам себя столько раз, пока пользователь верно не вобьет фигуру
        }
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}


