package oop;

import java.util.Objects;

public class Magazine extends Publication implements Printable {
    public int issueNumber;

    public Magazine(String title, String author, int year, int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getType() {
        return "Журнал";
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + String.format(", issueNumber=%d}", issueNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Magazine m = (Magazine) obj;
        return issueNumber == m.issueNumber;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), issueNumber);
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void printDetails() {
        System.out.printf("%s | Автор/редакция: %s | Год: %d | Номер выпуска: %d%n", getTitle(), getAuthor(), getYear(), issueNumber);
    }
}
