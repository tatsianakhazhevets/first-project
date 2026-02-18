package mentoring.Practice14_ProgramPrinciples.homework.Task_1.after_array;

import java.util.ArrayList;

public class MathOperations {

    public static int add(ArrayList<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}