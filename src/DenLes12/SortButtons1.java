package DenLes12;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortButtons1 {
    public void sortByWeightFromTo(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {

                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if (!o1.getFirm().equals(o2.getFirm())) {
                    return o1.getFirm().compareTo(o2.getFirm());
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getFirm());
                }
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getVersion().equals(o2.getVersion())) {
                    return o1.getVersion().compareTo(o2.getVersion());
                }
                if (o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByWeightToFrom(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {

                if (o2.getWeight() != o1.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if (!o2.getFirm().equals(o1.getFirm())) {
                    return o2.getFirm().compareTo(o1.getFirm());
                }
                if (o2.getName().equals(o1.getName())) {
                    return o2.getName().compareTo(o1.getFirm());
                }
                if (o2.getYear() != o1.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (o2.getVersion().equals(o1.getVersion())) {
                    return o2.getVersion().compareTo(o1.getVersion());
                }
                if (o2.getColor().equals(o1.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByFirmFromTo(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {

                if (!o1.getFirm().equals(o2.getFirm())) {
                    return o1.getFirm().compareTo(o2.getFirm());
                }
                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getFirm());
                }
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getVersion().equals(o2.getVersion())) {
                    return o1.getVersion().compareTo(o2.getVersion());
                }
                if (o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByFirmToFrom(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {

                if (!o2.getFirm().equals(o1.getFirm())) {
                    return o2.getFirm().compareTo(o1.getFirm());
                }
                if (o2.getWeight() != o1.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if (o2.getName().equals(o1.getName())) {
                    return o2.getName().compareTo(o1.getFirm());
                }
                if (o2.getYear() != o1.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (o2.getVersion().equals(o1.getVersion())) {
                    return o2.getVersion().compareTo(o1.getVersion());
                }
                if (o2.getColor().equals(o1.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByColorFromTo(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if (o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }
                if (!o1.getFirm().equals(o2.getFirm())) {
                    return o1.getFirm().compareTo(o2.getFirm());
                }
                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getFirm());
                }
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getVersion().equals(o2.getVersion())) {
                    return o1.getVersion().compareTo(o2.getVersion());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByColorToFrom(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if (o2.getColor().equals(o1.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }
                if (!o2.getFirm().equals(o1.getFirm())) {
                    return o2.getFirm().compareTo(o1.getFirm());
                }
                if (o2.getWeight() != o1.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if (o2.getName().equals(o1.getName())) {
                    return o2.getName().compareTo(o1.getFirm());
                }
                if (o2.getYear() != o1.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (o2.getVersion().equals(o1.getVersion())) {
                    return o2.getVersion().compareTo(o1.getVersion());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByNameFromTo(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {

                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getFirm());
                }
                if (o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }
                if (!o1.getFirm().equals(o2.getFirm())) {
                    return o1.getFirm().compareTo(o2.getFirm());
                }
                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getVersion().equals(o2.getVersion())) {
                    return o1.getVersion().compareTo(o2.getVersion());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByNameToFrom(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if (o2.getName().equals(o1.getName())) {
                    return o2.getName().compareTo(o1.getFirm());
                }
                if (o2.getColor().equals(o1.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }
                if (!o2.getFirm().equals(o1.getFirm())) {
                    return o2.getFirm().compareTo(o1.getFirm());
                }
                if (o2.getWeight() != o1.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if (o2.getYear() != o1.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (o2.getVersion().equals(o1.getVersion())) {
                    return o2.getVersion().compareTo(o1.getVersion());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByVersionFromTo(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if (o1.getVersion().equals(o2.getVersion())) {
                    return o1.getVersion().compareTo(o2.getVersion());
                }

                if (o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }
                if (!o1.getFirm().equals(o2.getFirm())) {
                    return o1.getFirm().compareTo(o2.getFirm());
                }
                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getFirm());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByVersionToFrom(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if (o2.getVersion().equals(o1.getVersion())) {
                    return o2.getVersion().compareTo(o1.getVersion());
                }

                if (o2.getColor().equals(o1.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }
                if (!o2.getFirm().equals(o1.getFirm())) {
                    return o2.getFirm().compareTo(o1.getFirm());
                }
                if (o2.getWeight() != o1.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if (o2.getYear() != o1.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (o2.getName().equals(o1.getName())) {
                    return o2.getName().compareTo(o1.getFirm());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByYearFromTo(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if (o1.getVersion().equals(o2.getVersion())) {
                    return o1.getVersion().compareTo(o2.getVersion());
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getFirm());
                }
                if (o1.getColor().equals(o2.getColor())) {
                    return o1.getColor().compareTo(o2.getColor());
                }
                if (!o1.getFirm().equals(o2.getFirm())) {
                    return o1.getFirm().compareTo(o2.getFirm());
                }
                if (o1.getWeight() != o2.getWeight()) {
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void sortByYearToFrom(TreeSet<Spoon> spoons) {
        TreeSet<Spoon> forSorting = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if (o2.getYear() != o1.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if (o2.getVersion().equals(o1.getVersion())) {
                    return o2.getVersion().compareTo(o1.getVersion());
                }
                if (o2.getName().equals(o1.getName())) {
                    return o2.getName().compareTo(o1.getFirm());
                }
                if (o2.getColor().equals(o1.getColor())) {
                    return o2.getColor().compareTo(o1.getColor());
                }
                if (!o2.getFirm().equals(o1.getFirm())) {
                    return o2.getFirm().compareTo(o1.getFirm());
                }
                if (o2.getWeight() != o1.getWeight()) {
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                return 0;
            }
        });
        forSorting.addAll(spoons);

        for (Spoon c : forSorting) {
            System.out.println(c);
        }
    }

    public void skaner(TreeSet<Spoon> spoons) {

        System.out.println("как вы хотите сортировать ? ");
        System.out.println("по имени от а до я  - введите '1'");
        System.out.println("по имени от я до а - введите '2'");
        System.out.println("по Фирме  - введите '3'");
        System.out.println("по Фирме в обратном порядке  - введите 4");
        System.out.println("по Цвету - введите 5 ");
        System.out.println("по Цвету в обратном порядке  - введите 6");
        System.out.println("по Весу  - введите 7 ");
        System.out.println("по Весу в обратном порядке  - введите 8");
        System.out.println("по Году - введите 9");
        System.out.println("по Году в обратном порядке  - введите 10");
        System.out.println("по Версии   - введите 11 ");
        System.out.println("по Версии в обратном порядке  - введите 12 ");



        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("1")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по названию ");
            sort1.sortByNameFromTo(spoons);
            System.out.println(spoons);
        }
        if (level.equalsIgnoreCase("2")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по названию в обратном порядке  ");
            sort1.sortByNameToFrom(spoons);
            System.out.println();
        }

        if (level.equalsIgnoreCase("3")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Фирме ");
            sort1.sortByFirmFromTo(spoons);
            System.out.println(spoons);
        }
        if (level.equalsIgnoreCase("4")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Фирме в обратном порядке  ");
            sort1.sortByFirmToFrom(spoons);
            System.out.println();
        }
        if (level.equalsIgnoreCase("5")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Цвету ");
            sort1.sortByColorFromTo(spoons);
            System.out.println(spoons);
        }
        if (level.equalsIgnoreCase("6")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Цвету в обратном порядке  ");
            sort1.sortByColorToFrom(spoons);
            System.out.println();
        }
        if (level.equalsIgnoreCase("7")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Весу ");
            sort1.sortByWeightFromTo(spoons);
            System.out.println(spoons);
        }
        if (level.equalsIgnoreCase("8")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Весу в обратном порядке  ");
            sort1.sortByWeightToFrom(spoons);
            System.out.println();
        }
        if (level.equalsIgnoreCase("9")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Году ");
            sort1.sortByYearFromTo(spoons);
            System.out.println(spoons);
        }
        if (level.equalsIgnoreCase("10")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Году в обратном порядке  ");
            sort1.sortByYearToFrom(spoons);
            System.out.println();
        }

        if (level.equalsIgnoreCase("11")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Версии ");
            sort1.sortByVersionFromTo(spoons);
            System.out.println(spoons);
        }
        if (level.equalsIgnoreCase("12")) {
            SortButtons1 sort1 = new SortButtons1();
            System.out.println(" Сортировка по Версии в обратном порядке  ");
            sort1.sortByVersionToFrom(spoons);
            System.out.println();

        }
    }
}




