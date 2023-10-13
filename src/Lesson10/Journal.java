package Lesson10;

public class Journal extends PrintEdition {

    private int numsInYear;

    public Journal() {
    }

    public Journal(String name, int year, String publisher, int numsInYear) {
        super(name, year, publisher);
        this.numsInYear = numsInYear;
    }

    public int getNumsInYear() {
        return numsInYear;
    }

    public void setNumsInYear(int numsInYear) {
        this.numsInYear = numsInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return numsInYear == journal.numsInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numsInYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал: {" +
                "номер в году =" + numsInYear + super.toString() +
                '}';
    }
}
