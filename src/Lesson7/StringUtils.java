package Lesson7;

import javax.sound.midi.Soundbank;

public class StringUtils {
    // метод который принимает входящим параметром email
    // делает проврку на валидацию
    // и пишет на консоль корректный это email или нет
    public static void checkValidMail(String email) {
        /** 1) Проверяем содержание собачки (@). Если ее нет - НЕ ВАЛИДНЫЙ
         *  2) Проверяем, что собачка только одна. Если ее нет - НЕ ВАЛИДНЫЙ
         *  3) Собачка дложна стоять не в начале, и не в конце. Если ее нет - НЕ ВАЛИДНЫЙ
         *  4) Должна быть хотя бы одна точка после собачки (@)
         *  5) Точка после собачки не может быть в начале или в конце
         *  ДОБАВИТЬ КАК МОЖНО БОЛЬШЕ ПРОВЕРОК НА EMAIL
         */

        // ["kd", "fh.k", "jdj"]
        if (email.isBlank()) {
            System.out.println("Email не может быть пустым и содержать пробелы");
            return;
        }

        if (!email.contains("@")) {
            System.out.println("Не содержит собачку!!!");
            return;
        }
        // сохранится массив ["kd, "fn.k", "jgj"]
        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length > 2) {
            System.out.println("Собачек больше одной!!!");
            return;
        }
        if (email.startsWith("@") || email.endsWith("@")) {
            System.out.println("Email не может начинаться или заканчиваться с собачки");
            return;
        }
        if (email.contains("?") || email.contains("*") || email.contains("/") || email.contains("!") ||
                email.contains("<") || email.contains(">") || email.contains("\\") || email.contains("&") ||
                email.contains("%") || email.contains("№") || email.contains("^") || email.contains("(") || email.contains(")")
                || email.contains("$") || email.contains(",") || email.contains(":") || email.contains(";") ||
                email.contains("~")) {
            System.out.println("Email не может содержать специальные символы и знаки препинания");
            return;
        }
        if (email.contains("..") || email.contains("--") || email.contains("__") || email.contains(".-") ||
                email.contains("-.") || email.contains("._") || email.contains("_.") || email.contains("-_") ||
                email.contains("_-")) {
            System.out.println("Email не может содержать две точки подряд и / или два дефиса подряд и / или два " +
                    "нижних подчеркивания подряд, в том числе, комбинацию этих символов подряд.");
            return;
        }
        if (email.startsWith(".") || email.endsWith(".") || email.startsWith("-") || email.endsWith("-")) {
            System.out.println("Email не может начинаться или заканчиваться на точку или дефис");
            return;
        }
        String lastPart = partsOfEmail[1];
        if (!lastPart.contains(".")) {
            System.out.println("Email не содержит точку во второй части после собачки!!!");
            return;
        }
        if (lastPart.startsWith(".") || lastPart.startsWith("-") || lastPart.startsWith("+") || lastPart.startsWith("_")) {
            System.out.println("Доменная часть не может начинаться с точки или дефиса!!!");
            return;
        }
        for(int i = 0; i < email.length(); i++) {
            if(Character.UnicodeBlock.of(email.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC)) {
                System.out.println("еmail не должен содержать кириллицу!");
                return;
                // содержит кириллицу
            }
        }
        email.toCharArray();
        for (int i = 0; i < email.toCharArray().length; i++) {
            if (email.toCharArray()[i] > 0x7F) {
                System.out.println("email должен содержать только латинские символы!");
                return;
            }
        }

        System.out.println("email подходит!");

    }

    private static class CharMatcher {
    }
}
