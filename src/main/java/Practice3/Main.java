package Practice3;

import java.awt.color.CMMException;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        // 1
        Company dima = new Company(1, "Дмитрий");
        Company anna = new Company(2, "Анна");
        Company tania = new Company(3,"Татьяна");
        dima.print();
        anna.print();
        tania.print();
        Company.printCompanyName();
        Company.setCompanyName("Test Company");
        Company.printCompanyName();

        // 2
        System.out.println("Площадь круга " + MathConstants.calculateArea(5));
        System.out.println("Площадь круга " + MathConstants.calculateArea(3));
        System.out.println("Площадь круга " + MathConstants.calculateArea(1));
        System.out.println("Длины окружности " + MathConstants.calculateCircumference(5));
        System.out.println("Длины окружности " + MathConstants.calculateCircumference(3));
        System.out.println("Длины окружности " + MathConstants.calculateCircumference(1));

        // 3
        Library potter = new Library("Гарри Поттер", "Дж. К. Роулинг", 1997, "Фэнтези");
        potter.getBookTitle();
        potter.print();

        // 4
        University kolya = new University(1, "Коля");
        University katya = new University(2, "Катя");
        University olya = new University(3, "Оля");
        University.changeUniversityName("BSU");
        kolya.printStudentInfo();
        katya.printStudentInfo();
        olya.printStudentInfo();

        // 5
        GameSettings lego = new GameSettings("Lego", 4);
        GameSettings logo = new GameSettings("Logo", 7);
        lego.printGameStatus();
        logo.printGameStatus();
        GameSettings.setMaxPlayers(8);
        lego.addPlayer();
        logo.addPlayer();
        lego.printGameStatus();
        logo.printGameStatus();

        // 6
        Person one = new Person("One", "One", "111-11-1111");
        Person two = new Person("Two", "Two", "222-22-2222");
        Person three = new Person("Three", "Three", "333-33-3333");
        one.setFirstName("Five");
        one.setLastName("Five");
        one.printPersonInfo();
        two.printPersonInfo();
        three.printPersonInfo();













    }
}
