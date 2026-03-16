package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(double discount) {
        return this.price = this.price - (this.price * discount / 100);
    }

    public void printInfo() {
        System.out.println("Product name: " + this.name + ", Price: " + this.price + " euro");
    }
}