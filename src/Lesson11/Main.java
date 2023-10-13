package Lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add ("qwerty" + 1);
        }

        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add ("qwerty" + 1);
        }

        long time3 = System.currentTimeMillis();

        System.out.println("ArrayList add - " + (time2 - time1));
        System.out.println("LinkedList add - " + (time3 - time2));


        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }

        long time4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }

        long time5 = System.currentTimeMillis();

        System.out.println("ArrayList add - " + (time4 - time3));
        System.out.println("LinkedList add - " + (time5 - time4));

    }
}
