package lesson15;

public class Test {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        long time1 = System.currentTimeMillis();
        copyWithOneByte.copy("C:\\Users\\Пользователь\\IdeaProjects\\javaJunior40\\src\\lesson1\\SW.BAND.zip", "test1.zip");
        long time2 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time2 - time1));

        CopywithGuava copywithGuava = new CopywithGuava();
        long time3 = System.currentTimeMillis();
        copywithGuava.copy("C:\\Users\\Пользователь\\IdeaProjects\\javaJunior40\\src\\lesson1\\SW.BAND.zip", "test2.zip");
        long time4 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time4 - time3));

        CopyWithCommonIO copyWithCommonIO = new CopyWithCommonIO();
        long time5 = System.currentTimeMillis();
        copyWithCommonIO.copy("C:\\Users\\Пользователь\\IdeaProjects\\javaJunior40\\src\\lesson1\\SW.BAND.zip", "test3.zip");
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование по одному байту: " + (time6 - time5));
    }
}
