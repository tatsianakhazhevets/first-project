package mentoring.Practice4.My;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        //giveMeNumber();
        //numbersWithoutThree();
        firstTenNumbers();

    }

    public static int giveMeNumber() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Стоп!");
            break;
        }
        sum += number;
        System.out.println("Сумма: " + sum);
        }
        return sum;
    }



    public static void numbersWithoutThree(){
        int number = 1;

        while (number <= 20) {
        if (number % 3 == 0) {
            number++;
            continue;
        }
        System.out.println("Number " + number);
        number++;
        }
    }



    public static void firstTenNumbers(){

        int number = 1;
        int count = 0;

        while (true) {
            if (number % 2 == 0 && number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            if (count == 10) {
                break;
            }
            number++;
        }
    }
}
