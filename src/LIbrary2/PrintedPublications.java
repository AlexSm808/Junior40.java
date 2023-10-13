package LIbrary2;

import java.util.Objects;

public class PrintedPublications {

    protected String name;

    protected String author;

    protected int yearOfRelease;

    protected int numOfPages;

    protected int numInYear;

    protected String publisher;

    public PrintedPublications() {
    }

    public PrintedPublications(String name, int yearOfRelease, int numInYear, String publisher) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.numInYear = numInYear;
        this.publisher = publisher;
    }

    public PrintedPublications(String name, String author, int yearOfRelease, int numOfPages, String publisher) {
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
        this.numOfPages = numOfPages;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumInYear() {
        return numInYear;
    }

    public void setNumInYear(int numInYear) {
        this.numInYear = numInYear;
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

        PrintedPublications that = (PrintedPublications) o;

        if (yearOfRelease != that.yearOfRelease) return false;
        if (numOfPages != that.numOfPages) return false;
        if (numInYear != that.numInYear) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(author, that.author)) return false;
        return Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + yearOfRelease;
        result = 31 * result + numOfPages;
        result = 31 * result + numInYear;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrintedPublications{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", numOfPages=" + numOfPages +
                ", numInYear=" + numInYear +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}


