package Lesson10;

import java.util.Objects;

public class PrintEdition {
    private String name;

    private int year;

    private String Publisher;

    public PrintEdition() {
    }

    public PrintEdition(String name, int year, String publisher) {
        this.name = name;
        this.year = year;
        Publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;

        if (year != that.year) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(Publisher, that.Publisher);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + (Publisher != null ? Publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " Имя ='" + name + '\'' +
                ", год выпуска =" + year +
                ", издательство ='" + Publisher;
    }
}
