package mentoring.example;

public class MathOperations {
    public static void main(String [] args){
    int add = sum(10, 5);
    int sub = subtract(10, 5);
    int mult = multiply(10,5);
    double div = divide(10,5);
    int max = findMax(20, 30);
    int dif = difference(25,3);
    int squa = squareArea(4);
    int perim = squarePerimeter(4);
    int minutes = convertSecondsToMinutes(120);
    double speed = averageSpeed(10, 5);
    double hyp = findHypotenuse(3,4);
    double circle = circleCircumference (7);
    double percentage = calculatePercentage(100, 50);
    double fehrenheit = celsiusToFahrenheit(15);
    double celsius = fahrenheitToCelsius (96);
    System.out.println("1. Сумма двух чисел " + add);
    System.out.println("1. Разность двух чисел " + sub);
    System.out.println("1. Произведение двух чисел " + mult);
    System.out.println("1. Результат деления  " + div);
    System.out.println("2. Нахождение максимума двух чисел " + max);
    System.out.println("3. Нахождение разницы между двумя числами " + dif);
    System.out.println("4. Площадь квадрата " + squa);
    System.out.println("4. Периметр квадрата " + perim);
    System.out.println("5. Перевод секунд в минуты " + minutes);
    System.out.println("6. Вычисление средней скорости " + speed);
    System.out.println("7. Нахождение гипотенузы " + hyp);
    System.out.println("8. Вычисление длины окружности " + circle);
    System.out.println("9. Вычисление процентов " + percentage);
    System.out.println("10. Перевод градусов Цельсия в Фаренгейты " + fehrenheit);
    System.out.println("10. Обратно " + celsius);
    }
    public static int sum(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static double divide(int x, int y){
        return (double) x / y;
    }
    public static int findMax(int a, int b){
        return Math.max(a, b);
    }
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }
    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side){
        return 4 * side;
    }
    public static int convertSecondsToMinutes(int seconds){
        return seconds / 60;
    }
    public static double averageSpeed(double distance, double time){
        return distance / time;
    }
    public static double findHypotenuse(double a, double b){
        return Math.sqrt(2 * a + 2 * b);
    }
    public static double circleCircumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static double calculatePercentage(double total, double part){
        return (part / total) * 100;
    }
    public static double celsiusToFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}
