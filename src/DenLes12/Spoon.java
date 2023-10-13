package DenLes12;

import java.util.Objects;

public class Spoon {

    private double weight;
    private String color;
    private String firm;
    private String name;
    private String version;
    private int year;

    public Spoon() {
    }

    public Spoon(double weight, String color, String firm, String name, String version, int year) {
        this.weight = weight;
        this.color = color;
        this.firm = firm;
        this.name = name;
        this.version = version;
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spoon spoon = (Spoon) o;

        if (Double.compare(weight, spoon.weight) != 0) return false;
        if (year != spoon.year) return false;
        if (!Objects.equals(color, spoon.color)) return false;
        if (!Objects.equals(firm, spoon.firm)) return false;
        if (!Objects.equals(name, spoon.name)) return false;
        return Objects.equals(version, spoon.version);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (firm != null ? firm.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return " Блесна {" +
                " Вес - " + weight +
                " Цвет - " + color + '\'' +
                " Фирма - " + firm + '\'' +
                " Название - " + name + '\'' +
                " Версия - " + version + '\'' +
                " Год выпуска - " + year +
                '}';
    }


}

