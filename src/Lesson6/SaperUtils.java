package Lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {
    public static void fillMines(int[][] field) {
        for (int mine = 0; mine < 10; mine++) {
            int row = ThreadLocalRandom.current().nextInt(0, 9);
            int col = ThreadLocalRandom.current().nextInt(0, 9);
            if (field[row][col] == -1) { // если там уже мина
                mine--;
            } else {
                field[row][col] = -1;

            }
        }
    }

    public static void insertNumsAroundMines(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) { // если в клеточке мина
                    if (i == 0 && j == 0) {  // левый верхний угол
                        if (field[i][j + 1] != -1) // если не мина, увеличиваем на 1 соседа справа
                            field[i][j + 1] += 1;
                        if (field[i + 1][j + 1] != -1) // если не мина, увеличиваем на 1 соседа справа внизу
                            field[i + 1][j + 1] += 1;
                        if (field[i + 1][j] != -1) // если не мина, увеличиваем на 1 соседа снизу
                            field[i + 1][j] += 1;
                    }
                    int lastJ = field[i].length - 1;
                    int lastI = field.length - 1;
                    if (i == 0 && j == lastJ) {  // правый верхний угол
                        if (field[i][j - 1] != -1) // если не мина, увеличиваем на 1 соседа справа
                            field[i][j - 1] += 1;
                        if (field[i + 1][j - 1] != -1) // если не мина, увеличиваем на 1 соседа справа внизу
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1) // если не мина, увеличиваем на 1 соседа снизу
                            field[i + 1][j] += 1;
                    }
                    if (i == lastI && j == 0) { // левый нижний угол
                        if (field[i - 1][j] != -1) // если сосед сверху не мина
                            field[i - 1][j] += 1;   // увеличиваем на 1
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                    }

                    if (i == lastI && j == lastJ) { // правый нижний угол
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                    }

                    if ((i == 1 && j == 0) || (i == 2 && j == 0) || (i == 3 && j == 0) || (i == 4 && j == 0) || (i == 5 && j == 0) || (i == 6 && j == 0) || (i == 7 && j == 0)) {
                        // расстановка на левую сторону
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                    }

                    if ((i == 0 && j == 1) || (i == 0 && j == 2) || (i == 0 && j == 3) || (i == 0 && j == 4) || (i == 0 && j == 5) || (i == 0 && j == 6) || (i == 0 && j == 7)) {
                        // расстановка на верхнюю сторону
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                    }

                    if ((i == 1 && j == lastJ) || (i == 2 && j == lastJ) || (i == 3 && j == lastJ) || (i == 4 && j == lastJ) || (i == 5 && j == lastJ) || (i == 6 && j == lastJ) || (i == 7 && j == lastJ)) {
                        // расстановка на правую сторону
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                    }

                    if ((i == lastI && j == 1) || (i == lastI && j == 2) || (i == lastI && j == 3) || (i == lastI && j == 4) || (i == lastI && j == 5) || (i == lastI && j == 6) || (i == lastI && j == 7)) {
                        // расстановка на нижнюю сторону
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                    }

                    // расстановка цифр на центральное поле
                    if (i != 0 && j != 0 && j != lastJ && i != lastI) {
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                    }
                }
            }
        }
    }

    public static void printField(int[][] field, boolean[][] mask) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (mask[i][j]) { // если в массиве mask клеточку true отображать
                    System.out.print(field[i][j] + " ");
                } else { // если клеточку false отображать
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
    }
}

