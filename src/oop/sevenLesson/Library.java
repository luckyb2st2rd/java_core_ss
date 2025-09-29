package oop.sevenLesson;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("first", "first");
        Book second = new Book("first", "first");
        Book third = new Book("first", "second");

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println("first.equals(second) = " + first.equals(second));
        System.out.println("first.equals(third)  = " + first.equals(third));
        System.out.println("hash(first) == hash(second) = " + (first.hashCode() == second.hashCode()));
    }
}
