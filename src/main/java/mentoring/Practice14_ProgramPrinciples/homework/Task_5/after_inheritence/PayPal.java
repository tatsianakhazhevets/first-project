package mentoring.Practice14_ProgramPrinciples.homework.Task_5.after_inheritence;

public class PayPal extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}