package Lesson3;

import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        // коллекция LinkedList  (подходит для массива, в котором элемнты постоянно добавляются либо
        // удаляются
        LinkedList<Float> nums = new LinkedList<>();
        nums.add(5.6f);
        nums.add(6.7f);
        nums.add(33.2f);
        for (Float i : nums)
            System.out.println(i);

    }
}
