package Practice14_ProgramPrinciples.video.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("kolay", "kolay@h.com"));
        users.add(new User("petya", "petya@h.com"));

        UserRepository userRepository = new UserRepository(users);
        TaskRepository taskRepository = new TaskRepository();

        Project project = new Project(userRepository, taskRepository);

        project.addTask(new Task("Clean floor", "please do attentively", new Date()));
        project.assignTaskToUser("Clean floor", "petya");
        project.completeTask("Clean floor");
    }
}

// principles: DRY, SRP, OCP