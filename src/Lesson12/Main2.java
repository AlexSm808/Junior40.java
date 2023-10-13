package Lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 { // Сортировка коллекций
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(37);
        nums.add(34);
        nums.add(23);
        nums.add(78);
        nums.add(54);

        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });


        for (Integer num : nums) {
            System.out.println(num);
        }

    }
}
