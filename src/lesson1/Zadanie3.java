package lesson1;

public class Zadanie3 {
    public static void main(String[] args) {
        int requiredAmount = 10000; //необходимая сумма
        int amountPerEveryTuesday = 2; //сумма за каждый вторник
        int daysOfYear = 365; //количество дней в году
        int daysOfWeek = 7; //количество дней в неделе
        int weeksOfYear = daysOfYear / daysOfWeek; //количечтво недель в году (соответственно и вторников)
        int requiredNumberOfYears = requiredAmount / (weeksOfYear * amountPerEveryTuesday);
        System.out.println(requiredNumberOfYears);


    }
}
