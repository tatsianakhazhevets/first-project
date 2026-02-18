package mentoring.Practice4.HomeWork;

import java.util.Scanner;

public class SwitchHomeWork {
    public static void main(String[] args) {
        // 2.1
        //System.out.println(checkDayByNumber());
        //System.out.println(checkDayByNumber());
        //System.out.println(checkDayByNumber());
        //System.out.println(checkDayByNumber());

        // 2
        //System.out.println(solarSystem(Planet.SATURN));

        // 3
        System.out.println(calculateNumbers());
        System.out.println(calculateNumbers());
        System.out.println(calculateNumbers());
        System.out.println(calculateNumbers());
        System.out.println(calculateNumbers());


    }

    public static String checkDayByNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int dayNumber = scanner.nextInt();

        String dayDescription = "";
        switch (dayNumber){
            case 1:
                dayDescription = "Понедельник";
                break;
            case 2:
                dayDescription = "Вторник";
                break;
            case 3:
                dayDescription = "Среда";
                break;
            case 4:
                dayDescription = "Четверг";
                break;
            case 5:
                dayDescription = "Пятница";
                break;
            case 6:
                dayDescription = "Суббота";
                break;
            case 7:
                dayDescription = "Воскресенье";
                break;
            default:
                dayDescription = "Неверно";
                break;
        }
        return dayDescription;
    }


    public static String solarSystem(Planet planet) {
        String typePlanet = "";
        int order = 0;
        double mass = 0.0;

        switch (planet) {
            case MERCURY -> {
                typePlanet = "MERCURY";
                order = 1;
                mass = 0.055;
                System.out.println("Название планеты:: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса относительно Земли: " + mass);
            }

            case VENUS -> {
                typePlanet = "VENUS";
                order = 2;
                mass = 0.815;
                System.out.println("Название планеты: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса планеты: " + mass);
            }

            case EARTH -> {
                typePlanet = "EARTH";
                order = 3;
                mass = 1.0;
                System.out.println("Название планеты: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса планеты: " + mass);
            }

            case MARS -> {
                typePlanet = "MARS";
                order = 4;
                mass = 0.107;
                System.out.println("Название планеты: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса планеты: " + mass);
            }

            case JUPITER -> {
                typePlanet = "JUPITER";
                order = 5;
                mass = 317.8;
                System.out.println("Название планеты: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса планеты: " + mass);
            }

            case SATURN -> {
                typePlanet = "SATURN";
                order = 6;
                mass = 95.2;
                System.out.println("Название планеты: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса планеты: " + mass);
            }

            case URANUS -> {
                typePlanet = "URANUS";
                order = 7;
                mass = 14.5;
                System.out.println("Название планеты: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса планеты: " + mass);
            }

            case NEPTUNE -> {
                typePlanet = "NEPTUNE";
                order = 8;
                mass = 17.1;
                System.out.println("Название планеты: " + typePlanet +
                        "\nПорядковый номер: " + order +
                        "\nМасса планеты: " + mass);
            }

        }
        return typePlanet;
    }


    public static double calculateNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        double y = scanner.nextInt();
        System.out.print("Введите знак: ");
        String sigh = scanner.next();

        double OperationsXY = 0.0;
        switch (sigh){
            case "+":
                OperationsXY = x + y;
                break;
            case "-":
                OperationsXY = x - y;
                break;
            case "*":
                OperationsXY = x * y;
                break;
            case "/":
                OperationsXY = x / y;
                break;
            default:
                System.out.println("Неверно!");
        }
        return OperationsXY;
    }

}
