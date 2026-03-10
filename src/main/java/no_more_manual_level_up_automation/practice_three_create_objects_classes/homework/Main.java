package no_more_manual_level_up_automation.practice_three_create_objects_classes.homework;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 1990);
        car.setYear(1991);
        car.print();

        Rectangle rectangle = new Rectangle(9, 5);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculateArea());

        Book book = new Book("The compound effect", "Daren Hardy");
        book.setAuthor("Darren Hardy");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Tania", 5000.0);
        bankAccount.deposit(5000.0);
        bankAccount.withdraw(1000.0);
        bankAccount.printBalance();

        Point point = new Point(55.862, 63.458);
        point.setX(53.863);
        point.print();

        StudentGroup studentGroup = new StudentGroup("Automation Group", 50);
        studentGroup.setStudentCount(75);
        studentGroup.printInfo();

        Circle circle = new Circle(5.0);
        circle.setRadius(7.0);
        System.out.println("Circle Area: " + circle.calculateArea() + ", Circle Circumference: " + circle.calculateCircumference());

        Teacher teacher = new Teacher("Tania", "Information");
        teacher.setSubject("Testing");
        teacher.printInfo();

        Product product = new Product("QA School", 50.0);
        product.setPrice(60.0);
        product.applyDiscount(5);
        product.printInfo();

        Laptop laptop = new Laptop("Apple", 1500);
        laptop.setPrice(1400);
        laptop.printInfo();
    }
}