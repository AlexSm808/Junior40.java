package homeWork13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        Pattern decimalNumPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = decimalNumPattern.matcher(text);

        List<String> decimalNumList = new ArrayList<>();
        while (matcher.find()) {
            decimalNumList.add(matcher.group());
        }
        String[] strDecimalArray = decimalNumList.toArray(new String[0]);
        double[] array = Arrays.stream(strDecimalArray).mapToDouble(Double::parseDouble).toArray();


                                                    // решение при помощи цикла
//        for (int i = 0; i < decimalNumList.size(); i++) {
//            array[i] = Double.parseDouble(decimalNumList.get(i));
//        }
        if (decimalNumList.isEmpty()) {
            throw new CustomException("Not fou234.9nd");
        }
        return array;

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

