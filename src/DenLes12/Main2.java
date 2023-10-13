package DenLes12;

import DenLes12.Spoon;

import java.util.Comparator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet <Spoon> spoons = new TreeSet<>(new Comparator<Spoon>() {
            @Override
            public int compare(Spoon o1, Spoon o2) {
                if(!o1.getFirm().equals(o2.getFirm())){
                    return o1.getFirm().compareTo(o2.getFirm());
                }

                if (o1.getName().equals(o2.getName())){
                    return o1.getName().compareTo(o2.getFirm());
                }
                if(o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o1.getWeight(),o2.getWeight());
                }
                if (o1.getVersion().equals(o2.getVersion())){
                    return o1.getVersion().compareTo(o2.getVersion());
                }
                if (o1.getColor().equals(o2.getColor())){
                    return o1.getColor().compareTo(o2.getColor());
                }

                return 0;
            }
        });

        spoons.add(new Spoon(2.8,"MC11","Forest","MIU","Limited19",2021));
        spoons.add(new Spoon(2.8,"MC9","Forest","PAL","PAL Limited Color",2023));
        spoons.add(new Spoon(2.8,"MC13","Forest","MIU","PAL Color",2019));
        spoons.add(new Spoon(1.5,"U22","Nories","Weeper","Limited12",2015));
        spoons.add(new Spoon(2.5,"E76","Yarie","Dexter","GLOW",2017));
        spoons.add(new Spoon(1.8,"CR021","Nories","Rooney","GLOW1",2023));
        spoons.add(new Spoon(2.8,"04","Forest","Fix","Limited22",2022));

        SortButtons1 sort1 = new SortButtons1();

//        System.out.println(" Сортировка по названию ");
//        sort1.sortByNameFromTo(spoons);
//        System.out.println();
//        System.out.println(" Сортировка по названию  в обратном порядке ");
//        sort1.sortByNameToFrom(spoons);
//        System.out.println();
//
//
//        System.out.println("Сортировка по цвету ");
//        sort1.sortByColorFromTo(spoons);
//        System.out.println();
//        System.out.println(" Сортировка по цвету в обратном порядке ");
//        sort1.sortByColorToFrom(spoons);
//        System.out.println();
//        System.out.println();
//
//
//        System.out.println("Сортировка по весу  ");
//        sort1.sortByWeightFromTo(spoons);
//        System.out.println();
//        System.out.println("Сортировка по весу в обратном порядке ");
//        sort1.sortByWeightToFrom(spoons);
//        System.out.println();
//
//        System.out.println(" Сортировка по фирме ");
//        sort1.sortByFirmFromTo(spoons);
//        System.out.println();
//        System.out.println(" Сортировка по фирме в обратном порядке ");
//        sort1.sortByFirmToFrom(spoons);
//        System.out.println();
//
//        System.out.println(" Сортировка по версии ");
//        sort1.sortByVersionFromTo(spoons);
//        System.out.println();
//        System.out.println(" Сортировка по версии в обратном порядке ");
//        sort1.sortByVersionToFrom(spoons);
//        System.out.println();
//
//        System.out.println(" Сортировка по году ");
//        sort1.sortByYearFromTo(spoons);
//        System.out.println();
//        System.out.println("Сортировка по году в обратном порядке");
//        sort1.sortByYearToFrom(spoons);


        sort1.skaner(spoons);
    }

    }


