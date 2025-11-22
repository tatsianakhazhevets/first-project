package Practice14_ProgramPrinciples.video.task1;

public class Project {
    // private List<Task> tasks = new ArrayList<>();
    // private List<User> users = new ArrayList<>();
    // Вместо двух списков теперь есть два репозитория
    // private UserRepository userRepository = new UserRepository();
    // private TaskRepository taskRepository = new TaskRepository();
    // после создания конструктора пишем просто
    private UserRepository userRepository;
    private TaskRepository taskRepository;

    public Project(UserRepository userRepository, TaskRepository taskRepository) {
        this.userRepository = userRepository;
        this.taskRepository = taskRepository;
    }

    // public void addTask(String title, String description, Date dueDate) {
    //    Task task = new Task(title, description, dueDate);
    //    tasks.add(task);
    //    System.out.println("Task added: " + title);
    //} -> сокращаем метод до одной строчки ниже

    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

//    // public void assignTaskToUser(String title, String username) {
//    //     for(Task task : tasks) {
//    //         if(task.getTitle().equals(title)) {
//    //             for(User user : users) {
//    //               if(user.getUsername().equals(username)) {
//                        task.setUser(user);
//                        System.out.println("Task " + title + " assigne to " + username);
//                    }
//                }
//            }
//        }
//    } -> сокращаем метод до двух понятных строчек

    public void assignTaskToUser(String title, String username) {
        Task task = taskRepository.findTask(title); // находим таску по тайтлу
        task.setUser(userRepository.findUser(username)); // мэтчим таску и юзера
        System.out.println("Task: " + title + "was assigned to " + username);
    }

//    public void completeTask(String title) {
//        for(Task task : tasks) {
//            if(task.getTitle().equals(title)) {
//                task.setCompleted(true);
//                System.out.println("Task completed: " + title);
//            }
//        }
//    } -> сокращаем метод до двух понятных строчек

    public void completeTask(String title) {
        Task task = taskRepository.findTask(title); // находим таску по тайтлу
        task.setCompleted(true); // ставим комплитед тру
        System.out.println("Task: " + title + "was completed");
    }
}