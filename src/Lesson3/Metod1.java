package Lesson3;

public class Metod1 {
    public static void main(String[] args) {
        // созаем метод, который принимает определенный массив и далее он подсчитывать среднее значение
        // всех элементов и после будет возвращать сумму из функции
        int[] nums1 = {20, 456, 99, 73, 11};
        int average1 = avArr(nums1);
        System.out.println("Среднее значение элементов массива1: " + average1);

        int[] nums2 = {33, 876, 66, 73, 1, 55, 40};
        int average2 = avArr(nums2);
        System.out.println("Среднее значение элементов массива1: "+ average2);


    }
    public static int avArr(int[] arr) {
        int summa = 0;
        int average;
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        average = summa / arr.length;
        return average;
    }
}
