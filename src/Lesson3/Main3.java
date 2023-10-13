package Lesson3;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        // НУжно написать программу, которая будет работать 5 лет без остановки
        // Но в момент, когда мы ее остановим - она нам напишет сколько
        // прошло от старта
        for (int year = 0; year < 5; year++) {
            for (int day = 0; day < 365; day++) {
                for (int month = 0; month < 12; month++) {
                    for (int hour = 0; hour < 24; hour++) {
                        for (int min = 0; min < 60; min++) {
                            for (int sec = 0; sec < 60; sec++) {
                                System.out.printf("Со старта прошло: %d год, %d дней, %d месяца, %d часа, %d минут, %d секунд \n", year, day, month, hour, min, sec);
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
        }
    }
}
