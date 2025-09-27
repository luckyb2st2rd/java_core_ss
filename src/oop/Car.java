package oop;

public class Car {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886) {
            System.out.println("Возраст не может быть меньше 1886 года");
            return;
        }
        this.year = year;
    }

    public String toString() {
        return brand + " " + model + " (" + (year == 0 ? "год не задан" : year) + ")";
    }
}