package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        // Есть массив цифр, вывести на консоль все числа в обратном порядке
        // при этом дважды вывести те числа, которые являются кратными трём
        int[] nums = {8, 11, 77, 54, 33, 24, 165, 17};
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 3 == 0) {
                System.out.println(nums[i]);
                System.out.println(nums[i]);
            } else {
                System.out.println(nums[i]);
            }
        }
    }
}
