package Practice4.Solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // Проверка метода четности
        System.out.println(checkParity(4));
        System.out.println(checkParity(7));

        // Проверка метода определения возраста
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(71));

        // Проверка метода по нахождения максимального среди трех чисел
        System.out.println(checkMax(3, 7, 5));
    }

    /**
     * Метод для проверки четности числ number
     * @param number
     * @return
     */
    public static String checkParity(int number){
        // if - else
        // number % 2 == 0 - четное -> 2 % 2 == 0
        // number % 2 == 1 - нечетное -> 6 % 2 и остаток 1
        // в методе должен быть один return -> доп переменная
        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }

        return parity;
    }

    /**
     * Метод для проверки возраста
     * @param age
     * @return
     */

    public static String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60){
            ageDescription = "Взрослый";
        }
        if (age > 60){
            ageDescription = "Пожилой";
        }
        return ageDescription;

    }

    /**
     * Метод для определения максимального числа
     * @param a
     * @param b
     * @param c
     */

    public static int checkMax(int a, int b, int c){
        int maxAB = b;
        if (a > b){
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB){
            max = c;
        }

        return max;
    }

}




