package homeWork13;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        StringUtils2 str = new StringUtils2();

        try {
            System.out.println("\nРезультат деления: " + str.div("11", "5"));
        } catch (NullPointerException npe) {
            System.out.println("number1 или number2 не должны быть null");
        } catch (NumberFormatException nfe) {
            System.out.println("number1 или number2 не числа");
        } catch (ArithmeticException aE) {
            System.out.println("number2 не может быть равно нулю");
        }

        try {
            String text = "hi, dfsdlfsdlf, hi, daa2 hi, df, hi";
            String word = "hi";
            int[] findWord = str.findWord(text,word);
            System.out.println("\nИндексы вхождения слова " + word + ":");
            System.out.println(Arrays.toString(findWord));              // заменяет проход циклом for или for each
        } catch (NullPointerException npe) {
            System.out.println("text или word не должны быть null");
        }

        try {
            double[] nums = str.findNumbers("исхwe3одный т-235екст");
                System.out.println("\nЧисла из строки в виде массива: ");
                System.out.println(Arrays.toString(nums));

        } catch (CustomException exception) {
            System.out.println("\nCustom exception " + exception.getMessage()); //getMessage - сообщение, которое создается в классе (new Exception)
        }
    }
}
