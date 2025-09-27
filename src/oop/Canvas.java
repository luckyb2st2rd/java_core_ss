package oop;

public class Canvas {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle("a"), new Square("b"), new Triangle("c")};

        for (Shape all : shapes) {
            all.draw();
            all.calculateArea();
        }
    }
}
