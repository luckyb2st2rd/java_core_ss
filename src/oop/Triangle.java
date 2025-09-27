package oop;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        int s = (3 * 4) / 2;
        System.out.println("Площадь треугольника равна: " + s + " см.");
    }
}
