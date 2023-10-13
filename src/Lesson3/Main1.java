package Lesson3;

public class Main1 {
    public static void main(String[] args) {
        // Есть массив чисел, нужно напечатать только четные числа в массиве, и в обратном порядке
        int[] nums = {23, 5, 88, 455, 7, 8, 96};
        // 6  5  4  3  2  1  0
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
