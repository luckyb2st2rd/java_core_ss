package oop;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Publication> publications = new ArrayList<>();

    public void addPublication(Publication pub) {
        if (pub == null) {
            return;
        }
        publications.add(pub);
    }

    public void listPublications() {
        if (publications.isEmpty()) {
            System.out.println("Каталог пуст.");
            return;
        }
        for (Publication p : publications) {
            System.out.println(p);
        }
    }

    public void searchByAuthor(String author) {
        if (author == null || author.isBlank()) {
            System.out.println("Автор не указан.");
            return;
        }
        boolean exit = false;
        for (Publication p : publications) {
            if (author.equals(p.getAuthor())) { // точное совпадение
                System.out.println(p);
                exit = true;
            }
        }
        if (!exit) {
            System.out.println("Публикации с таким автором не найдены.");
        }
    }
}
