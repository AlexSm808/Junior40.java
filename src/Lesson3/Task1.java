package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        // Есть массив цифр, вывести на консоль все числа с массива, которые больше 10,
        // но меньше 25
        int[] nums = {8, 11, 77, 54, 32, 24, 165, 17};
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 10 && nums [i] < 25){
                System.out.println(nums[i]);
            }
        }
    }
}
