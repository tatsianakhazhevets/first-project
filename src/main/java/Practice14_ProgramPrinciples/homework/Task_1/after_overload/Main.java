package Practice14_ProgramPrinciples.homework.Task_1.after_overload;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations =new MathOperations();
        System.out.println(mathOperations.add(1, 2));
        System.out.println(mathOperations.add(1, 2, 3));
        System.out.println(mathOperations.add(1, 2, 3, 4));
    }
}