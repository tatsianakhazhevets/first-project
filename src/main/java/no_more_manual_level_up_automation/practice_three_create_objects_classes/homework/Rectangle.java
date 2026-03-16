package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return  this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return this.width * this.height;
    }
}
