package Practice14_ProgramPrinciples.homework.Task_5.after_interface;

public class Bitcoin implements Payable {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}