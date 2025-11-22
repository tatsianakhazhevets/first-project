package Practice14_ProgramPrinciples.homework.Task_8.after;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        NotificationService notificationService = new NotificationService(emailSender);
        notificationService.sendNotification("All 8 tasks are ready!");
    }
}