package oop;

class Person {
    String name = new String();
    String nameTwo = new String();

    void test1() {
        System.out.println("Привет " + name);
    }

    void test2() {
        System.out.println("Привет " + name);
    }

    void test3() {
        System.out.println("Привет " + nameTwo);
    }
}

public class Main {
    public static void main(String[] args) {
        int num = 1;
        double pi = 3.14;
        boolean richtig = true;
        System.out.println(num);
        System.out.println(pi);
        System.out.println(richtig);
        Person first = new Person();
        Person two = new Person();
        first.name = "Arsyan";
        first.test1();
        first.name = null;
        first.test1();
        first.test2();
        two.nameTwo = first.name;
        two.test3();
        System.gc();
    }
}
