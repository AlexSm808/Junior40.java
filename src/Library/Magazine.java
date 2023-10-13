package Library;

public class Magazine extends Books {
    // создаем дочерний класс - журналы
    private int numberInYear;

    public Magazine() {
    }

    public Magazine(String name, int yearOfPublication, int numberInYear, String publisher) {
        super(name, yearOfPublication, publisher); // наследуемые параметры у класса книги
        this.numberInYear = numberInYear; // собственный параметр класса журнал
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setNumberInYear(int numberInYear) {
        this.numberInYear = numberInYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        return numberInYear == magazine.numberInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberInYear;
        return result;
    }

    @Override
    public String toString() { // переопределенный метод от класса книги
        return "Журнал{" +
                "название = '" + name + '\'' +
                ", год выхода = " + yearOfPublication +
                ", номер = '" + numberInYear + '\'' +
                ", издательство = '" + publisher + '\'' +
                '}';
    }
}
