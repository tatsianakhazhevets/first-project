package Practice8.HomeWork.task_4;

public class Main {
    public static void main(String[] args) {
        TaskFour taskFour = new TaskFour();

       try {
           taskFour.checkEmail("taxa@gmail.com");
       } catch (InvalidEmailException e) {
           System.out.println("Ошибка: " + e.getMessage());
       }

    }
}
