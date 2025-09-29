package oop;

public class Book extends Publication {
    public String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getType() {
        return "Книга";
    }

    @Override
    public String toString() {
        super.toString();
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        Object o = new Object();
        super.equals(o);
        return true;
    }

    public int hashCode() {
        super.hashCode();
        return 1;
    }
}
