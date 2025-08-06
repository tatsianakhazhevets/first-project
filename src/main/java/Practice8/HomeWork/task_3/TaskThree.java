package Practice8.HomeWork.task_3;

public class TaskThree {

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Такого возраста нет");
        } else {
            System.out.println("Возраст: " + age);
        }
    }
}
