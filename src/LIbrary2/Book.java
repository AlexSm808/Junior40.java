package LIbrary2;

import java.util.Objects;

public class Book extends PrintedPublications {

    public Book() {
    }

    public Book(String name, String author, int yearOfRelease, int numOfPages, String publisher) {
        super(name, author, yearOfRelease, numOfPages, publisher);
    }

    @Override
    public String toString() {
        return "Книга {" +
                "название = '" + name + '\'' +
                ", автор = '" + author + '\'' +
                ", год издания = " + yearOfRelease +
                ", количество страниц = " + numOfPages +
                ", издательство = '" + publisher + '\'' +
                '}';
    }
}



