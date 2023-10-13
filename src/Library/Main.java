package Library;

import BlackJack.Card;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyLibrary library = new MyLibrary();

        library.prepareLibrary(); // заполняем массив элементами

        library.printMyLibrary(); // выводим все элементы массива на консоль !!! При выполнении программа
        // работает по - разному в зависимости от типа данных (журнал или книга) проявление полиморфизма

        System.out.println();

        library.printLargestBook(); // находим самое толстое издание и выводим информацию о нем на консоль
        //!!!реализуется полиморфизм так, как программа динамически подстраивается и выполняется по-разному для
        // книг и журналов, выводит параметры согласно конструкторам конкретных классов
    }
}