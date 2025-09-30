package oop;

import java.util.Objects;

public abstract class Publication {
    private String title;
    private String author;
    private int year;

    public Publication(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%s{title='%s', author='%s', year=%d}", getType(), title, author, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Publication that = (Publication) obj;
        return year == that.year && Objects.equals(title, that.title) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    private static int publicationCont = 0;

    public static int getPublicationCont() {
        publicationCont++;
        return publicationCont;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
