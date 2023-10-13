package LIbrary2;

public class Journal extends PrintedPublications {

    public Journal() {
    }

    public Journal(String name, int yearOfRelease, int numInYear, String publisher) {
        super(name, yearOfRelease, numInYear, publisher);
    }



    @Override
    public String toString() {
        return "Журнал{" +
                "название = '" + name + '\'' +
                ", год выхода= " + yearOfRelease +
                ", номер = " + numInYear +
                ", издательство = '" + publisher + '\'' +
                '}';
    }
}