package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.round(Math.PI * this.radius * this.radius);
    }

    public double calculateCircumference() {
        return Math.round(2 * Math.PI * this.radius);
    }
}