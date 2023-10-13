package Phone;

public class Phone {
    // Задание № 1 - создаем класс Phone с установленными переменными;
    private String number;
    private String model;
    private double weight;

    // Задание № 5 - Добавить конструктор в класс Phone, который принимает на вход три параметра для
    // инициализации переменных класса - number, model, weight;
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Задание № 7 - добавить конструктор без параметров;
    public Phone() {
    }

    // Задание № 6 - Добавить конструктор, который принимает на вход два параметра для
    // инициализации переменных класса - number, model;
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }

    public void receiveCall(String name) {
        System.out.print("Звонит " + "{" + name + "}" + "\n");
        System.out.println();
    }
}
