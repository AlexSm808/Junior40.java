package Lesson3;

import java.util.ArrayList;

public class CoolectionsArrayList {
    public static void main(String[] args) {
        // Коллекция ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5); // добавляет элемент в массив
        nums.add(50);
        nums.add(1,30); // добавляет элемент по идексу
        System.out.println(nums.size()); // выводит на консоль длину коллекции (nums)
        System.out.println(nums.get(0)); // выводит на консоль элемент с индексом (0)
        nums.remove(2); // удаляет из списка элемент с индексом (2)
        nums.clear(); // удаляет все элементы из списка (очищает весь список)

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
