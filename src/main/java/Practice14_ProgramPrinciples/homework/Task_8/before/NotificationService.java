package Practice14_ProgramPrinciples.homework.Task_8.before;

public class NotificationService {
    private EmailSender emailSender = new EmailSender();
    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}