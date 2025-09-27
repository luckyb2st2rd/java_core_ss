package oop;

public class MainCar {
    public static void main(String[] args) {
        Car auto1 = new Car();
        auto1.setBrand("Mercedes");
        auto1.setModel("G63 AMG");
        auto1.setYear(1887);

        Car auto2 = new Car();
        auto2.setBrand("BMW");
        auto2.setModel("M5 F90");
        auto2.setYear(1885);

        System.out.println(auto1);
        System.out.println(auto2);
    }
}
