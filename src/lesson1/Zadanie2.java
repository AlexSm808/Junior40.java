package lesson1;

public class Zadanie2 {
    public static void main(String[] args) {
        int lengthOfTable = 4; //длина стола
        int widthOfTable = 3; //ширина стола
        int lengthOfRoom = 16; //длина комнаты
        int widthOfRoom = 6; //ширина комнаты
        int squareOfTable = lengthOfTable * widthOfTable; //вычисляем площадь стола
        int squareOfRoom = lengthOfRoom * widthOfRoom; // вычисляем площадь комнаты
        int quantityOfTablesInRoom = squareOfRoom / squareOfTable; //вычисляем итоговый результат (кол-во столов в комнате)
        System.out.println(quantityOfTablesInRoom);
    }
}
