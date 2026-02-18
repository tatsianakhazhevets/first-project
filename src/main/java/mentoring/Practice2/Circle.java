package mentoring.Practice2;

public class Circle {
    double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }
    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    void print(){
        double area = calculateArea(this.radius);
        double calcukate = calculateCircumference(this.radius);
        System.out.println("Площадь окружности: " + area + " Длина окружности: " + calcukate);
    }

}
