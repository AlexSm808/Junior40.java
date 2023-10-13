package lesson4;

public class Practica {
    public static void main(String[] args) {
        // Есть двухмерный массив ноликов
        // нужно напечатать на консоль только его диагональ
        // вместо остальных - пустота
        int[][] nums = new int[9][9];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++)
                if (i == j) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            System.out.println();
        }
    }
}
