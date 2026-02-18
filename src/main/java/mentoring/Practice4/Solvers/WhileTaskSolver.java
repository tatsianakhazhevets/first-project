package mentoring.Practice4.Solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        // проверка метода по распечатке всех чисел от 1 до 10
        // printAllNumbersBeforeTen();

        // проверка программы по считываю команд,пока не введут exit
        // commandReader();

        // проверка метода по подсчету сумм цифр в числе
        System.out.println(someOfDigits(123));
        System.out.println(someOfDigits(1101));

    }

    public static void printAllNumbersBeforeTen(){
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while(!command.equals("exit")) {
            System.out.print("Ведите команды: ");
            command = scanner.nextLine();
        }
        System.out.println("Программа завершена");
    }

    public static int someOfDigits(int number){
        // nuber = 123, 1 + 2 + 3
        // остаток на деление на 10: 123 % 10 = 3
        // 123 \ 10 = 12 - 12 \ 10 = 2
        // 2 \ 10 = 1 - 1 / 10 = 1
        int sum = 0;
        while(number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;





    }

}
