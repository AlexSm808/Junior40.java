package Lesson3;

public class Task6 {
    public static void main(String[] args) {
        // Есть массив цифр, вывести на консоль только те числа, которые содержат в себе символ 4
        int[] nums = {8, 11, 77, 54, 4, 24, 55, 17};
        char[] symbols = new char[nums.length];
        for (int i = 0; i < nums.length; i++) {
            symbols[i] = (char) (nums[i] + '0');
        }
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == '4') {
                System.out.println(symbols[i]);
            }
        }
    }
}
