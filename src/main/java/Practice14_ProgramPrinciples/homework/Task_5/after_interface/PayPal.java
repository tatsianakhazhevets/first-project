package Practice14_ProgramPrinciples.homework.Task_5.after_interface;

public class PayPal implements Payable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}