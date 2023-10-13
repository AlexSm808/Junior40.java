package Lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridj fridj = new Fridj();
        fridj.addProduct("Бананы", 3);
        fridj.addProduct("Бананы", 1);
        fridj.addProduct("Бананы", 5);
        fridj.addProduct("Малина", 1);
        fridj.addProduct("Слива", 8);
        fridj.addProduct("Огурцы", 1);

        fridj.printProductsCloseToEnd(); // Выводим продукты, которые скоро закончатся, т.е., значение которых меньше 2
        System.out.println();

        fridj.printLargestProduct();     // Выводим на консоль продукт, которого больше всего в холодильнике
        System.out.println();

        fridj.printProductsSortByName(); // Выводим на консоль продукты, отсортированные по названию (по умолчпанию от А до Я)
        System.out.println();

        fridj.printProductsSortByWeightFromTo(); // Выводим на консоль продукты, отсортированные по весу от меньшего


    }
}
