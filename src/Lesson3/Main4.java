package Lesson3;

public class Main4 {
    public static void main(String[] args) {
        // Есть 2 знаменателя
        // Нужно определить общий знаменатель
        int znam1 = 5;
        int znam2 = 8;
        //тернарный оператор
        int biggestZnam = znam1; // на biggestZnam сохранит БОЛЬШЕЕ из 2х чисел
        if(znam2 > znam1) {
            biggestZnam = znam2;
        }
        for (int i = biggestZnam; i <= znam1 * znam2; i++){ // перебираем цифры от 8 до 40
            if(i % znam1 == 0 && i % znam2 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
