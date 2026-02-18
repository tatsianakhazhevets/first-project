package mentoring.Practice14_ProgramPrinciples.homework.Task_5.after_inheritence;

public class Bitcoin extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}