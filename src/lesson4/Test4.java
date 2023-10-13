package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("Выберите уровень ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");
        //формула создания любого ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("особый")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int mines = scanner.nextInt();
            int[][] field = new int[a][b];
//            if (mines > ((a * b) - (a + b - 1))) {
//                mines = (a * b) - (a + b - 1);
//            }
//            System.out.println(mines);}
            for (int i = 0; i < mines; i++) {
                // нужно поставить рандомно 1 мину
                int row = ThreadLocalRandom.current().nextInt(0, a);
                int col = ThreadLocalRandom.current().nextInt(0, b);
                if (field[row][col] != 0) { // если уже есть в клеточке мина
                    i--; // откат попытки
                } else { // если нет в клеточке мины
                    field[row][col] = 1;
                }
                field[row][col] = 8;
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
//            }
            }
        }
    }
}