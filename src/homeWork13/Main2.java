package Lesson13;

public class Main2 {
    public static void main(String[] args) {
        StringUtils2 str = new StringUtils2();

        try {
            System.out.println(str.div("11", "5"));
        } catch (NullPointerException npe) {
            System.out.println("number1 или number2 не должны быть null");
        } catch (NumberFormatException nfe) {
            System.out.println("number1 или number2 не числа");
        } catch (ArithmeticException aE) {
            System.out.println("number2 не может быть равно нулю");
        }

        try {
            int[] findWord = str.findWord("hi, dfsdlfsdlf, hi, daa2 hi", "hi");
            for (int index : findWord)
                System.out.println(index);
        } catch (NullPointerException npe) {
            System.out.println("text или word не должны быть null");
        }

    }
}
