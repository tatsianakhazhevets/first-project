package mentoring.Practice4.HomeWork;

import java.security.PublicKey;
import java.util.Scanner;

public class IfElseHomeWork {
    public static void main(String[] args) {
        // 1.1
        //System.out.println(checkPositiveNegative());
        //System.out.println(checkPositiveNegative());
        //System.out.println(checkPositiveNegative());

        // 1.2
        //System.out.println(maxNumber(9,8));

        // 1.3
        //System.out.println(gradeNumber());

    }

    public static String checkPositiveNegative(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        String numberDescription = "";
        if (number > 0) {
            numberDescription = "Число положительное";
        }
        if (number < 0) {
            numberDescription = "Число отрицательное";
        }
        if (number == 0) {
            numberDescription = "Число равно нулю";
        }
        return numberDescription;
    }

    public static int maxNumber(int a, int b) {
        int max = a;
        if (b > a) {
            max = b;
        }
        return max;
    }

     public static String gradeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();

        String gradeDescription = "";
        if (grade == 5) {
            gradeDescription = "Отлично";
        }
        if (grade == 4) {
            gradeDescription = "Хорошо";
        }
        if (grade == 3) {
            gradeDescription = "Удовлетворительно";
        }
        if (grade == 2 || grade == 1) {
            gradeDescription = "Неудовлетворительно";
        }
        return gradeDescription;
     }

}
