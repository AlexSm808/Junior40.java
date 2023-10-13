package Lesson7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMetods {
    //  Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте
    public static int quantityOfVowels(String text) {
        int quantityOfVowels = 0;
        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.toCharArray()[i] == 'a' || text.toCharArray()[i] == 'e' || text.toCharArray()[i] == 'i' ||
                    text.toCharArray()[i] == 'o' || text.toCharArray()[i] == 'u' || text.toCharArray()[i] == 'A' ||
                    text.toCharArray()[i] == 'E' || text.toCharArray()[i] == 'I' || text.toCharArray()[i] == 'O' ||
                    text.toCharArray()[i] == 'U')
                quantityOfVowels += 1;
        }
        return quantityOfVowels;
    }

    public static int quantityOfVowels2(String text) {
        // второй вариант
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }

    public static String reverseText(String text) {
        // Метод принимает входящими параметрами текст, печатает на консоль этот же текст,
        // только в обратном порядке
        StringBuffer reverseText = new StringBuffer(text);
        reverseText.reverse();
        return reverseText.toString();
    }

    public static void reverseText2 (String text) {
        System.out.println(new StringBuilder(text).reverse());
    }

    public static void quantityOfPuncMarks2 (String text) {
        Pattern pattern = Pattern.compile("\\p{P}");
        Matcher matcher = pattern.matcher(text);
        int quantity = 0;
        while (matcher.find()) {
            quantity++;
        }
        System.out.println("Количество знаков препинания " + quantity);
    }

    public static void quantityOfPuncMarks(String text) {
        // Метод принимает входящими параметрами текст, и печатает на консоль
        // сколько в тексте знаков пунктуации
        int quantityOfPuncMarks = 0;

        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.toCharArray()[i] == '.' || text.toCharArray()[i] == ',' || text.toCharArray()[i] == '-' ||
                    text.toCharArray()[i] == ';' || text.toCharArray()[i] == '?' || text.toCharArray()[i] == '!' ||
                    text.toCharArray()[i] == ')' || text.toCharArray()[i] == '(' || text.toCharArray()[i] == ':' ||
                    text.toCharArray()[i] == '"')
                quantityOfPuncMarks += 1;
        }
        System.out.println(quantityOfPuncMarks);
    }

    public static void printQuadrate() {
        // D метод передаем кол-во строк и коли-во колонок, метод печатает на консоль квадрат из единичек
        // по этим параметрам
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int row = scanner.nextInt();
        System.out.println("Введите количество колонок");
        int col = scanner.nextInt();
        if (row < 2 || col < 2) {
            System.out.println("Вы ввели недопустимое значение!");
            printQuadrate();
        } else {
            if (row == col) {
                int[][] quadrate = new int[row][col];
                StringMetods.getQuadrate(quadrate);
            } else if (row < col) {
                col = row;
                int[][] quadrate = new int[row][col];
                StringMetods.getQuadrate(quadrate);
            } else if (col < row) {
                row = col;
                int[][] quadrate = new int[row][col];
                StringMetods.getQuadrate(quadrate);
            }
        }
    }

    public static void getQuadrate(int quadrate[][]) {

        for (int i = 0; i < quadrate.length; i++) {
            for (int j = 0; j < quadrate[i].length; j++) {
                if (i == 0 || j == 0 || i == quadrate.length - 1 || j == quadrate.length - 1) {
                    quadrate[i][j] = 1;
                    System.out.print(quadrate[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printQuadrate2 (int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}

