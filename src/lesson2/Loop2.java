package lesson2;

public class Loop2 {
    public static void main(String[] args) {
       for (int i = 100; i <=1000; i++) {
           if (i % 2 != 0 && i % 5 == 0) {
               System.out.println(i);
           }
       }
    }
}
