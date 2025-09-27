package oop;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Drawing a generic shape");
    }

    public void calculateArea() {
        System.out.println("Считаем площадь фигур");
    }
}
