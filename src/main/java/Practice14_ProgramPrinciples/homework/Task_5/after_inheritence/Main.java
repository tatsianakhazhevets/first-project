package Practice14_ProgramPrinciples.homework.Task_5.after_inheritence;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCard();
        creditCard.processPayment(10.10);

        PaymentProcessor payPal = new PayPal();
        payPal.processPayment(20.20);

        PaymentProcessor bitcoin = new Bitcoin();
        bitcoin.processPayment(30.30);
    }
}