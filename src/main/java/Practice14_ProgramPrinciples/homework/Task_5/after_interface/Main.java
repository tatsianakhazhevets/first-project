package Practice14_ProgramPrinciples.homework.Task_5.after_interface;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.processPayment(10.10);

        PayPal payPal = new PayPal();
        payPal.processPayment(20.20);

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.processPayment(30.30);
    }
}