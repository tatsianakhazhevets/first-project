package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class Car {

    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Car brand: " + this.brand + ", Year of car production: " + this.year);
    }
}