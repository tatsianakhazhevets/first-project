package Practice2;

public class Main {
    public static void main(String[] args) {
        // 1
        Car toyota = new Car("Toyota", 2015);
        toyota.setYear(2014);
        toyota.print();

        // 2
        Rectangle rectangle1 = new Rectangle(5, 3);
        rectangle1.setWidth(4);
        rectangle1.print();

        // 3
        Book potter = new Book("Гарри Поттер", "Джоан Роулинг");
        potter.setAuthor("Роулинг Джоан");
        potter.printInfo();

        // 4
        BankAccount my = new BankAccount("Tania", 5000);
        my.deposit(5000);
        my.withdraw(2000);
        my.printBalance();

        // 5
        Point location = new Point(5, 10);
        location.setX(6);
        location.print();

        // 6
        StudentGroup pravo = new StudentGroup("QA", 25);
        pravo.setStudentCount(26);
        pravo.printInfo();

        // 7
        Circle circle1 = new Circle(5);
        circle1.setRadius(2);
        circle1.print();

        // 8
        Teacher anna = new Teacher("Анна Ивановна" , "Математика");
        anna.setSubject("Русский язык");
        anna.printInfo();

        // 9
        Product bread = new Product("Хлеб", 50);
        bread.setPrice(55);
        bread.applyDiscount(20);
        bread.printInfo();


        // 10
        Laptop lenovo = new Laptop("Lenovo", 70000);
        lenovo.setPrice(80000);
        lenovo.printInfo();


    }
}

