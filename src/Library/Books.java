package Library;

import java.util.ArrayList;
import java.util.Objects;

public class Books {
    // Создаем родительский класс - Книги
    protected String name;

    private String writer;

    protected int yearOfPublication;

    private int numberOfPages;

    protected String publisher;

    public Books() {
    }

    public Books(String name, int yearOfPublication, String publisher) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
    }

    public Books(String name, String writer, int yearOfPublication, int numberOfPages, String publisher) {
        this.name = name;
        this.writer = writer;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "название = '" + name + '\'' +
                ", автор = '" + writer + '\'' +
                ", год издания = " + yearOfPublication +
                ", количество страниц = " + numberOfPages +
                ", издательство = '" + publisher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (yearOfPublication != books.yearOfPublication) return false;
        if (numberOfPages != books.numberOfPages) return false;
        if (!Objects.equals(name, books.name)) return false;
        if (!Objects.equals(writer, books.writer)) return false;
        return Objects.equals(publisher, books.publisher);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        result = 31 * result + yearOfPublication;
        result = 31 * result + numberOfPages;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }
}

