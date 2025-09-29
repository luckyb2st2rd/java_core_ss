package oop.sevenLesson;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title=' " + title + " ', author=" + author + "}";
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (this == obj) {
            result = true;
        } else if (obj == null || getClass() != obj.getClass()) {
            result = false;
        }
        Book book = (Book) obj;
        result = Objects.equals(author, book.author) && (Objects.equals(title, book.title));
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
