package Lesson3;

public class Metod3 {
    public static void main(String[] args) {
        // Создать две функции, которые считают разницу между суммой четных и нечетных чисел массива
        int[] nums1 = {10, 66, 888, 90, 77, 33, 2};
        int[] nums2 = {55, 70, 456, 30, 21, 5};
        int result1 = (mathArr(nums1));
        int result2 = (mathArr(nums2));
        System.out.println(result1);
        System.out.println(result2);
    }
    public static int mathArr(int[] Arr) {
        int summEvens = 0;
        int summOdds = 0;
        int result = 0;
        for (int i = 0; i < Arr.length; i++){
        if(Arr[i] % 2 == 0) {
            summEvens += Arr[i];
        }
        else {
            summOdds += Arr[i];
        }
            result = summEvens - summOdds;
        }
        return result;
    }
}
