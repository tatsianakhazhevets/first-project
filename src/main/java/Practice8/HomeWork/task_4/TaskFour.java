package Practice8.HomeWork.task_4;

public class TaskFour {

    public void checkEmail(String email) throws InvalidEmailException {
        if (email == null || !email.contains("@gmail.com")) {
            throw new InvalidEmailException("адрес введен неверно - " + email);
        } else {
            System.out.println("E-mail: " + email);
        }
    }
}
