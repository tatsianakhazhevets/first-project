package mentoring.Practice14_ProgramPrinciples.homework.Task_5.after_inheritence;

public class CreditCard extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}