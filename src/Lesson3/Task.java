package Lesson3;

public class Task {
    public static void main(String[] args) {
        // Есть массив цифр, вывести на консоль сколько в массиве четных цифр
        int[] nums = {8, 11, 77, 54, 32, 79, 165, 423};
        int countEvens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countEvens++;
            }
        }
        System.out.println(countEvens);
    }
}
