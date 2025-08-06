package Practice8.HomeWork.task_2;

public class TaskTwo {

    public void division(int x, int y) {

        int result = 0;

        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Делить нельзя! " + e.getMessage());
        } finally {
            if (y != 0) {
                System.out.println("Результат: " + result);
            }
        }
    }
}
