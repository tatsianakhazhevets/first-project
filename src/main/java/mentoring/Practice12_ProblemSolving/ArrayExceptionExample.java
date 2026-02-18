package mentoring.Practice12_ProblemSolving;

public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // i - указывает на индекс
        for(int i = 0; i <= numbers.length; i++) {
            System.out.println("Число: " + numbers[i]);
        }
    }
}
