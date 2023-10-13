package Lesson3;

public class Task5 {
    public static void main(String[] args) {
        // Есть массив qwer (char[] qwer = {'q','w','e','r'};). И так же есть второй массив
        // abcd (char[] abcd = {'a','b','c','d'};). Нужно создать третий массив, в который
        // с помощью цикла for переложить все символы с первого массива, и со второго.
        // по итогу получится третий массив который будет является соединенной копией первого
        // и второго массива.
        char[] qwer = {'q', 'w', 'e', 'r'};
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwerabcd = new char[qwer.length + abcd.length];
        for (int i = 0, j = 0; i < qwer.length; i++, j++) {
            qwerabcd[i] = qwer[i];
            qwerabcd[j + qwer.length] = abcd[j];
        }
        for (int k = 0; k < qwerabcd.length; k++) {
            System.out.println(qwerabcd[k]);
        }
    }
}

