package mentoring.Practice8.HomeWork.task_3;

public class Main {
    public static void main(String[] args) {
        TaskThree taskThree = new TaskThree();

        try {
            taskThree.checkAge(151);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
