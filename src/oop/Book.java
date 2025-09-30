package oop;

import java.util.Objects;

public class Book extends Publication implements Printable {
    public String ISBN;

    public Book(String title, String author, int year, String ISBN) {
        super(title, author, year);
        this.ISBN = ISBN;
    }

    @Override
    public String getType() {
        return "Книга";
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + String.format(", ISBN='%s'}", ISBN);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Book book = (Book) obj;
        return Objects.equals(ISBN, book.ISBN);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), ISBN);
    }

    @Override
    public void printDetails() {
        System.out.printf("%s | Автор: %s | Год: %d | ISBN: %s%n", getTitle(), getAuthor(), getYear(), ISBN);
    }

}
