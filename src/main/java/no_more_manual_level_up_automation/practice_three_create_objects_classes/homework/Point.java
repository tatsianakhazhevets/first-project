package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Coordinates: x = " + this.x + ", y = " + this.y);
    }
}
