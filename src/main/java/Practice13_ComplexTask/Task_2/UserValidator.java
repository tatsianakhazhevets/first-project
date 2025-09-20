package Practice13_ComplexTask.Task_2;

public class UserValidator {

    protected static boolean validationEnabled = true;
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 100;

    public static boolean validateName(String name) {
        return name != null && name.matches("^[A-Z][a-z]*$");
    }

    public static boolean validateAge(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }

    public static boolean validateEmail(String email) {
        return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public static void validate(User user) {
        if(!validationEnabled) {
            return;
        }
        if(!validateName(user.getName())) {
            throw new InvalidUserException("Name is not correct");
        }
        if(!validateAge(user.getAge())) {
            throw new InvalidUserException("Age is not correct");
        }
        if(!validateEmail(user.getEmail())) {
            throw new InvalidUserException("Email is not correct");
        }
    }
}