package mentoring.Practice15_ProjectPatterns.homework.builder.task1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("book", 1, "cash");
        Order flexibleOrder = new Order.Builder()
                .setPayment("card")
                .setItem("milk")
                .build();

        System.out.println(order);
        System.out.println(flexibleOrder);
    }
}