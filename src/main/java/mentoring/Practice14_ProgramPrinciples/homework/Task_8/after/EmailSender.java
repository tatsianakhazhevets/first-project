package mentoring.Practice14_ProgramPrinciples.homework.Task_8.after;

public class EmailSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}