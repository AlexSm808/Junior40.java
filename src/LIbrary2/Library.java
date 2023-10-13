package LIbrary2;

import java.util.ArrayList;

public class Library {

    private ArrayList<PrintedPublications> myLibrary = new ArrayList<>();

    public void prepareMyLibrary() {
        // метод запонляет массив неоднородными элементами
        myLibrary.add(new Book("Преступление и наказание", "Федор Михайлович Достоевский", 1866, 470, "Лабиринт"));
        myLibrary.add(new Book("Атлант расправил плечи", "Айн Рэнд", 1957, 1500, "Альпина"));
        myLibrary.add(new Journal("Современник", 1918, 6, "Эпоха"));
        myLibrary.add(new Book("Титан", "Теодор Драйзер", 1914, 2100, "Лабиринт"));
        myLibrary.add(new Book("Три товарища", "Эрик Мария Ремарк", 1936, 610, "Gyldendal"));
        myLibrary.add(new Journal("Новое время", 1978, 3, "Литера"));
        myLibrary.add(new Journal("Наука и техника", 2006, 1, "Лабиринт"));
        myLibrary.add(new Book("Бойцовский клуб", "Чак Паланик", 1996, 390, "W.W. Norton & Company"));

    }

    public void printMyLibrary() {
        // метод выводит на консоль все элементы массива
        for (PrintedPublications p : myLibrary)
            System.out.println(p);
    }

    public void printLargestPublication() {
        // метод находит в массие самое толстое издание и выводит на консоль информацию об этом произведнии
        int largestNumsOfPages = 0;
        for (PrintedPublications p : myLibrary) {
            if (p.getNumOfPages() > largestNumsOfPages)
                largestNumsOfPages = p.getNumOfPages();
        }
        for (PrintedPublications p : myLibrary)
            if (p.getNumOfPages() == largestNumsOfPages)
                System.out.println("Самое толстое издание - " + p);
    }
}
