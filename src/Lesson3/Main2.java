package Lesson3;

public class Main2 {
    public static void main(String[] args) {
        // Задача: создать массив длинной в 10 ячеек, и наполнить его
        // числами кратными 3 от 30  до .....пока не заполнится массив
        // вывести массив на консоль в качестве демонстрации заполнения
        int[] nums = new int[10];
//        nums[0] = 30;
//        nums[1] = 33;
//        nums[2] = 36;
//        nums[3] = 39;
//        nums[4] = 42;
//        // ....
//        nums[9] = 90;
        int value = 30;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = value;
            value = value + 3;
            System.out.println(nums[i]);
        }
    }
}
