package Lesson3;

public class Twodimmassiv {
    public static void main(String[] args) {
        // многомерные массивы данных
//        char[][] twoDimArray = new char[2][2];
//        twoDimArray[0][0] = 't';
//        System.out.println(twoDimArray[0][0]);
        byte[][] nums = {{6, 7, 8, 4, 43}, {4, 2, 11}, {3, 9, 15,87}, {20, 65, 33}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }
}