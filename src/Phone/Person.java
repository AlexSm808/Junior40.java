package Phone;

// Задание № 1 Создать класс Person который содержит: переменные fullName и age;
public class Person {
    private String fullName;
    private int age;

    // Задание № 3 - добавить два конструктора - Person() и Person(fullName, age);
    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Задание № 2 методы move и talk;
    public void move() {
        System.out.print(this.fullName + " говорит" + "\n");
        System.out.println();
    }


    public void talk() {
        System.out.print(this.fullName + " встаёт и говорит" + "\n");
        System.out.println();
    }
}
