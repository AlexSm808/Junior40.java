package Library;

import java.util.ArrayList;
import java.util.Objects;

public class MyLibrary {
    // внутри класса моя библиотека создаем неоднородный массив (коллекцию), в котором хранятся как книги,
    // так и журналы
    private ArrayList<Books> library = new ArrayList<>();

    public void prepareLibrary() {
        // метод запонляет массив неоднородными элементами
        library.add(new Books("Преступление и наказание", "Федор Михайлович Достоевский", 1866, 470, "Лабиринт"));
        library.add(new Books("Атлант расправил плечи", "Айн Рэнд", 1957, 1500, "Альпина"));
        library.add(new Magazine("Современник", 1918, 6, "Эпоха"));
        library.add(new Books("Титан", "Теодор Драйзер", 1914, 2100, "Лабиринт"));
        library.add(new Books("Три товарища", "Эрик Мария Ремарк", 1936, 610, "Gyldendal"));
        library.add(new Magazine("Новое время", 1978, 3, "Литера"));
        library.add(new Magazine("Наука и техника", 2006, 1, "Лабиринт"));
        library.add(new Books("Бойцовский клуб", "Чак Паланик", 1996, 390, "W.W. Norton & Company"));
    }

    public void printMyLibrary() {
        // метод выводит на консоль все элементы массива
        for (Books b : library)
            System.out.println(b);
    }

    public void printLargestBook() {
        // метод находит в массие самое толстое издание и выводит на консоль информацию об этом произведнии
        int largestNumsOfPages = 0;
        for (Books b : library) {
            if (b.getNumberOfPages() > largestNumsOfPages)
                largestNumsOfPages = b.getNumberOfPages();
        }
        for (Books b : library)
            if (b.getNumberOfPages() == largestNumsOfPages)
                System.out.println("Самое толстое издание - " + b);
    }
}

