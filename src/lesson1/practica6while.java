package lesson1;

public class practica6while {
    public static void main(String[] args) {
        String[] cars = {"audi", "bmw", "nissan", "mercedes", "ford", "porshe", "seat"};
        int i = 0;
        while (i < cars.length) { // цикл "до тех пор"
            System.out.println( cars[i] );
            // i = i + 1;
            i++; // инкремент
        }
    }

}