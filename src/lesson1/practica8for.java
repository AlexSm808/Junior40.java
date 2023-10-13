package lesson1;

public class practica8for {
    public static void main(String[] args) {

        int[] grades = {4, 5, 5, 4, 3, 4, 3, 5, 4};
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        System.out.println(sum);
        System.out.println((double) sum / grades.length);

        // решение без циклов

        /*int[] grades = {4,5,5,4,3,4,3,5,4};
        double average = (double) (grades[0]+grades[1]+grades[2]+grades[3]+grades[4]+grades[5]+grades[6]+grades[7]+grades[8]) / grades.length;
        System.out.println(grades.length);
        System.out.println(average);*/

        /*for (int i = 0; i < 101; i++) {
            System.out.println(i);*/
    }
}
