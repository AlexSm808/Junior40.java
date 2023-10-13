package Lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру");
        int[][] field = new int[9][9];
        boolean[][] mask = new boolean[9][9]; // заполнена false
//        mask[0][0] = true;     тест
//        mask[4][5] = true;    тест
        SaperUtils.fillMines(field);
        SaperUtils.insertNumsAroundMines(field);
        SaperUtils.printField(field, mask);



    }
}
