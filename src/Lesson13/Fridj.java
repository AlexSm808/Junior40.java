package Lesson13;

import java.util.*;

public class Fridj {

    private HashMap<String, Integer> products = new HashMap<>();

    private int capacity = 500;

    public void addProduct(String product, int weight) {

        if (products.containsKey(product)) {
            products.put(product, weight + products.get(product));

        } else {
            products.put(product, weight);
        }
    }

    public void printAllProducts() {

        for (Map.Entry<String, Integer> product : products.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }


    }

    public void getProduct(String product, int weight) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет");
            return;
        }
        if (products.get(product) < weight) {
            System.out.println("недостаточно " + " в холодильнике");
            products.remove(product);
            return;
        }

        if (products.get(product) == weight) {
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - weight);


    }

    public void printProductsCloseToEnd() {
        System.out.print("Скоро закончатся: ");
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() < 2)
                System.out.print(product.getKey() + "; ");
        }
        System.out.println();
    }

    public void printLargestProduct() {
        System.out.print("Больше всего в холодильнике: ");
        int largestWeight = 0;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() > largestWeight)
                largestWeight = product.getValue();
        }
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() == largestWeight) {
                System.out.print(product.getKey() + "; ");
            }
        }
        System.out.println();
    }

    public void printProductsSortByName() {
        TreeMap<String, Integer> sortedProducts = new TreeMap<>(products);
        for (Map.Entry<String, Integer> product : sortedProducts.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void printProductsSortByWeightFromTo() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(products.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> product : list) {
            sortedMap.put(product.getKey(), product.getValue());
        }

        for (Map.Entry<String, Integer> product : sortedMap.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }
    /**
     * 1) Метод должен выводить те продукты, которые скоро закончатся (те, которых меньше 2х кг)
     * 2) Вывести на консоль продукт, которого больше всего в холодильнике
     * 3)Выводить на консоль продукты, отсортированные по названию
     * ****
     * 4)вывести на консоль, отсортированные по весу от меньшего
     */

}