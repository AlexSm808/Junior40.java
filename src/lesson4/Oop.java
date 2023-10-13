package lesson4;

import java.util.SortedMap;

public class Oop {
    public static void main(String[] args) {
        // ООП: Классы и объекты
        Transport bmw = new Transport(); // создание объекта "bmw" на основе класса "Transport"
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinate = new byte[]{0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 6000;
        truck.color = "Red";
        truck.coordinate = new byte[]{100, 70, 30};

        System.out.println("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed);


        // мы можем обратиться к объекту и через "." мы имеем доступ
        // ко всем полям и методам
    }
}
