package oop;

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
        String result = "Вы выбрали произведение " + title + " написанное " + author + " в " + year + " году.";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int x = 1;
        return x;
    }

    private static int publicationCont = 0;

    public static int getPublicationCont() {
        publicationCont++;
        return publicationCont;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
