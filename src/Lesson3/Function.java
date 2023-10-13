package Lesson3;

public class Function {
    public static void main(String[] args) {
        // Функции внутри класса - это методы, (функции == метод в классе)
        info("Hello"); // чтобы вызвать функции необходимо прописать ее название, круглые скобки и ;
        String java = "Java";
        info(java);
        info(""); // передает пустую строку
        int years = 20;
        int result1 = summ(1, years);
        int num = 15;
        int result2 = summ(44,num);
        info(String.valueOf(result2));

    }

    public static int summ (int a, int b) { // вместо void указываем int, это тот тип, который данная
        // функция будет возвращать командой "return"
        int res = a + b;
        //        System.out.println("Результат: " + res);
        String result = "Результат: " + res;
        info(result);
        return res; // возвращает значение "res".

    }


    public static void info(String word) // в скобках () указываются параметры, которая данная функция может
    // передавать, далее в фигурных скобках указывается тело функции
    {
        System.out.print(word);
        System.out.println("!");

    } //если функция ничего не возвращает, то используется ключевое слово "void"
}
