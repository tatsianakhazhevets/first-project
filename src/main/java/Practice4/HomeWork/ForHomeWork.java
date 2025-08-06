package Practice4.HomeWork;

import java.util.Scanner;

public class ForHomeWork {
    public static void main(String[] args) {
        //numberCount();
        //System.out.println(sumOfNumbers());
        multipleTable();
    }


    public static void numberCount() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Итог: " + i);
            }
        }
    }

    public static int sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }


    public static void multipleTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number  +  "*"  +  i +  "=" + number * i);
        }
    }

}
