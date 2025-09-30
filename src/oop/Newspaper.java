package oop;

import java.util.Objects;

public class Newspaper extends Publication implements Printable {
    public String publicationDay;

    public Newspaper(String title, String author, int year, String publicationDay) {
        super(title, author, year);
        this.publicationDay = publicationDay;
    }

    @Override
    public String getType() {
        return "Газета";
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + String.format(", publicationDay='%s'}", publicationDay);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Newspaper n = (Newspaper) obj;
        return Objects.equals(publicationDay, n.publicationDay);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), publicationDay);
    }

    public String getPublicationDay() {
        return publicationDay;
    }

    public void setPublicationDay(String publicationDay) {
        this.publicationDay = publicationDay;
    }

    @Override
    public void printDetails() {
        System.out.printf("%s | Редакция: %s | Год: %d | День выхода: %s%n", getTitle(), getAuthor(), getYear(), publicationDay);

    }
}
