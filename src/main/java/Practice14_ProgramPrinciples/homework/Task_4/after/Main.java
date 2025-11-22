package Practice14_ProgramPrinciples.homework.Task_4.after;

public class Main {
    public static void main(String[] args){
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder();

        EmailSender emailSender = new EmailSender();
        emailSender.sendEmailConfirmation();

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.generateInvoice();
    }
}