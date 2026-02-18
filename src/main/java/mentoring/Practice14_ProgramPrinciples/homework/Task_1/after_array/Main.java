package mentoring.Practice14_ProgramPrinciples.homework.Task_1.after_array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    ArrayList<Integer> twoNumbers = new ArrayList<>(List.of(1, 2));
    ArrayList<Integer> treeNumbers = new ArrayList<>(List.of(1, 2, 3));
    ArrayList<Integer> fourNumbers = new ArrayList<>(List.of(1, 2, 3, 4));

    System.out.println(MathOperations.add(twoNumbers));
    System.out.println(MathOperations.add(treeNumbers));
    System.out.println(MathOperations.add(fourNumbers));

    }
}
