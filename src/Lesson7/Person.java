package Lesson7;

public class Person {
    // объявление характеристик (поля класса), переменные класса
    private int age;
    private String name;
    private String surname;
    private String phoneNumber;
    private String adress;

    public void setAge(int Age) {
        this.age = age;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String get() {
        return name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        // this - я (у меня)
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

