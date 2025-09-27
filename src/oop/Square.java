package oop;

public class Square extends Shape {
    public Square(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        double s = Math.pow(2, 2);
        System.out.println("Площадь квадрата равна: " + s + " см.");
    }
}
