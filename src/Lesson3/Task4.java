package Lesson3;

public class Task4 {
    public static void main(String[] args) {
        // Есть массив цифр, вывести на консоль разницу между суммой значений
        // четных ячеек и нечетных ячеек
        int[] nums = {8, 11, 77, 54, 33, 24, 165, 17};
        int sumOfEvensCells = 0;
        int sumOfOddsCells = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumOfEvensCells += nums[i];
            } else {
                sumOfOddsCells += nums[i];
            }
        }
        System.out.println(sumOfEvensCells - sumOfOddsCells);
    }
}
