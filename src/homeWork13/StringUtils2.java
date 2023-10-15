package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class StringUtils2 implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 или number2 не должны быть null");
        }

        if (!isNumber(number1) || !isNumber(number2)) {
            throw new NumberFormatException("number1 или number2 не числа!!");
        }

        if (Integer.parseInt(number2) == 0) {
            throw new ArithmeticException("number2 не может быть равно нулю");
        }
        double result = Double.parseDouble(number1) / Double.parseDouble(number2);
        return result;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("text или word не должны быть null");
        }

        List<Integer> indexes = new ArrayList<>();
        int index = text.indexOf(word);

        while (index != -1) {
            indexes.add(index);
            index = text.indexOf(word, index + 1);
        }
        int[] findWord = new int[indexes.size()];

        for (int i = 0; i < indexes.size(); i++) {
            findWord[i] = indexes.get(i);
        }
        return findWord;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }

    public boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
