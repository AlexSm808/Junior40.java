package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, guys ang girls, Hello";
        Pattern pattern1 = Pattern.compile("Hello.*");
        Matcher matcher1 = pattern1.matcher(text);
        if (matcher1.matches()) {
            System.out.println("Текст соответствует шаблону.");
        } else {
            System.out.println("Текст не соответствует шаблону.");
        }

        Pattern pattern2 = Pattern.compile("Hello");
        Matcher matcher2 = pattern2.matcher(text);
        int i = 0;
        while (matcher2.find()) {
            i += 1;
        }
        System.out.println(i);

        Pattern pattern3 = Pattern.compile("Hello");
        Matcher matcher3 = pattern3.matcher(text);

        String replacedText = matcher3.replaceAll("Hi!");
        System.out.println("Новый текст с изменениями: " + replacedText);


    }
}