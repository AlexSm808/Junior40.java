package Lesson11;

import Lesson12.ReverseNumsComparator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        // проход по коллекции
        // 1 - c помощью for - используется только в коллекциях ГДЕ ЕСТЬ ИНДЕКСЫ
        // 1 - с помощью for each - можно пройтись по коллекции, НО НЕ ИЗМЕНИТЬ ЕЕ
        // 3 - c помощью итератора - МОЖЕТ ПРОЙТИСЬ И МОДЕРНИЗИРОВАТЬ КОЛЛЕКЦИЮ
        TreeSet<Integer> texts = new TreeSet<>(new ReverseNumsComparator());
        // int = Integer;
        // double = Double
        // float = Float
        // char = Character;

        texts.add(8);
        texts.add(4);
        texts.add(3);
        texts.add(5);
        texts.add(33);
        texts.add(6);
        texts.add(2);

        for (Iterator<Integer> iterator = texts.iterator();iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}