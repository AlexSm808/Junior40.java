package Phone;

public class Main {
    public static void main(String[] args) {
        // Задание № 2 - создаем три экземпляра класса Phone;
        Phone phone1 = new Phone("8(916)233-23-23", "HUAWEI P40", 130);

        Phone phone2 = new Phone("+7(985)266-11-20", "NOKIA 3310", 205);

        Phone phone3 = new Phone("+7(905)387-09-18", "IPHONE 14 PRO", 198);


        System.out.print("Номер первого телефона: " + phone1.getNumber() + " \nМодель первого телефона: "
                + phone1.getModel() + " \nВес первого телефона: " + phone1.getWeight() + "\n");
        System.out.println(); // задание № 3 - выводит на консоль значения переменных;
        // задание № 4 - вызываем метод getNumber для каждого объекта;

        System.out.print("Номер второго телефона: " + phone2.getNumber() + " \nМодель второго телефона: "
                + phone2.getModel() + " \nВес второго телефона: " + phone2.getWeight() + "\n");
        System.out.println();

        System.out.print("Номер третьего телефона: " + phone3.getNumber() + " \nМодель третьего телефона: "
                + phone3.getModel() + " \nВес третьего телефона: " + phone3.getWeight() + "\n");
        System.out.println();

        phone1.receiveCall("Вася"); // Задание № 4 - вызываем метод receiveCall для каждого объекта
        phone2.receiveCall("Иван");
        phone3.receiveCall("Дмитрий");

        // Задание № 4 - Создаём два объекта класса Person, один объект инициализируется конструктором Person(),
        // другой - Person(fullName, age);
        Person julia = new Person("Романова Юлия",27);
        Person vlad = new Person();
        vlad.setFullName("Владислав Петров");
        vlad.setAge(51);

        // Задание № 5 - вызываем методыл move и talk у объектов класса Person;
        julia.move();
        julia.talk();
        vlad.move();
        vlad.talk();
    }


}
