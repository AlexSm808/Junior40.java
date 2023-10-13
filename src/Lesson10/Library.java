package Lesson10;

import java.util.ArrayList;

public class Library {

    private ArrayList<PrintEdition> editions = new ArrayList<>();

    public void fillEditions() {
        Book book1 = new Book("Азбука", 1930, "АБВ", "Иванов", 30);
        Book book2 = new Book("Тарас Бульба", 1950, "Толстой", "Иванов", 300);
        Book book3 = new Book("Война и мир", 1970, "АБВ", "Иванов", 560);
        Journal jurnal1 = new Journal("Бурда", 2010, "qwerty", 11);
        Journal jurnal2 = new Journal("Бурда", 2010, "qwerty", 8);
        editions.add(book1);
        editions.add(jurnal1);
        editions.add(book2);
        editions.add(book3);
        editions.add(jurnal2);

    }

    public void printAllEditions() {
        for (PrintEdition edition : editions) {
            System.out.println(edition); /// !!! Проявление полиморфизма
        }
    }

    public void printLargestBook() {
        PrintEdition largest = new Book("Заглушка", 1990, "fdf", "dfdf", -1); // заглушка
        for (PrintEdition edition : editions) {
            if (edition instanceof Book) {
                if (((Book) edition).getPages() > ((Book) largest).getPages()) {
                    largest = edition;
                }
            }
        }
        System.out.println("-------самая толстая книга---------");
        System.out.println(largest);
    }


}
