package Practice14_ProgramPrinciples.homework.Task_5.after_interface;

public class CreditCard implements Payable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}