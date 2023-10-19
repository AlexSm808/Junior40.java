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
        System.out.println("Копирование Guava: " + (time4 - time3));

        CopyWithCommonIO copyWithCommonIO = new CopyWithCommonIO();
        long time5 = System.currentTimeMillis();
        copyWithCommonIO.copy("C:\\Users\\Пользователь\\IdeaProjects\\javaJunior40\\src\\lesson1\\SW.BAND.zip", "test3.zip");
        long time6 = System.currentTimeMillis();
        System.out.println("Копирование CommonIO: " + (time6 - time5));

        CopyWithNIO copyWithNIO = new CopyWithNIO();
        long time7 = System.currentTimeMillis();
        copyWithNIO.copy("C:\\Users\\Пользователь\\IdeaProjects\\javaJunior40\\src\\lesson1\\SW.BAND.zip", "test4.zip");
        long time8 = System.currentTimeMillis();
        System.out.println("Копирование NIO: " + (time8 - time7));

        CopyWithChannels copyWithChannels = new CopyWithChannels();
        long time9 = System.currentTimeMillis();
        copyWithChannels.copy("C:\\Users\\Пользователь\\IdeaProjects\\javaJunior40\\src\\lesson1\\SW.BAND.zip", "test5.zip");
        long time10 = System.currentTimeMillis();
        System.out.println("Копирование Channels: " + (time10 - time9));

        CopyWithStreams copyWithStreams = new CopyWithStreams();
        long time11 = System.currentTimeMillis();
        copyWithStreams.copy("C:\\Users\\Пользователь\\IdeaProjects\\javaJunior40\\src\\lesson1\\SW.BAND.zip", "test6.zip");
        long time12 = System.currentTimeMillis();
        System.out.println("Копирование c помощью потоков " + (time12 - time11));


    }
}
