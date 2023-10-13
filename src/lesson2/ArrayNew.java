package lesson2;

public class ArrayNew {
    public static void main(String[] args) {
        String[] namesOfMonth = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                " Октябрь",
                "Ноябрь",
                "Декабрь"
        };
        String result = "";
        for (int i =0; i < namesOfMonth.length; i++){
            result = result + namesOfMonth[i];
            if (i == namesOfMonth.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
