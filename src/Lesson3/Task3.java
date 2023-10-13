package Lesson3;

public class Task3 {
    public static void main(String[] args) {
        // Есть массив цифр, вывести на консоль сумму значений всех ячеек
        int[] nums = {8, 11, 77, 54, 33, 24, 165, 17};
        int summOfCells = 0;
        for (int i = 0; i < nums.length; i++){
            summOfCells += nums[i];
        }
        System.out.println(summOfCells);
    }
}
