package oop;

public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        double s = 3.14 * Math.pow(4, 2);
        System.out.println("Площадь круга равна: " + s + " см.");
    }
}
