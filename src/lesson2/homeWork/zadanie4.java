package lesson2;

public class zadanie4 {
    public static void main(String[] args) {
        int secondsOfHour = 3600;
        int hours = 24;
        for (int secOfDay = 0; secOfDay <= secondsOfHour * hours; secOfDay++) {
            if (secOfDay / 24 == 3600)
                System.out.println(secOfDay);
        }

    }
}
