package lesson4;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 56, 43, 456, 444, 47, 78, 8, 6};
        // for - для прохода по массиву
        // for each - прохода по массиву (сокращенная версия)
        for ( int n: nums ) {
            // число преобразовываем в текст
            String numInText = n + ""; // "456"
            if (numInText.contains("4")){
                System.out.println(numInText);
            }
        }
    }
}
