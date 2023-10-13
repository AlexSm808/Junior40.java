package Lesson3;

public class Metod {
    public static void main(String[] args) {
        // созаем метод, который принимает определенный массив и далее он подсчитывать сумму всех
        // элементов и после будет возвращать сумму из функции
        byte[] nums1 = {5, 6, 8};
        int summ1 = summaArray(nums1);
        System.out.println("Сумма1: " + summ1);

        byte[] nums2 = {5,6,7,3,8};
        int summ2 = summaArray(nums2);
        System.out.println("Сумма2: " + summ2);
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }
}