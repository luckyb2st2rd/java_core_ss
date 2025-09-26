package oop;

class Book {
        String title;
        String author;
        int pages;

    void read() {
        System.out.println("Вы читаете книгу " + title + " авторства " + author);
    }
}

public class Bibliotek {
    public static void main(String[] args) {
        Book newBook = new Book();
        newBook.title = "Война и мир";
        newBook.author = "Лев Толстой";
        newBook.read();
    }
}
