package mentoring.Practice14_ProgramPrinciples.video.task2;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    // private List<Map<String, Object>> orders = new ArrayList<>();
    // private double totalSales = 0;
    // после создания всех классов, вносим его в менеджер OnlineStore
    private List<Order> orders = new ArrayList<>();
    private PaymentService paymentService;
    private DiscountStrategy discountStrategy;
    private BulkOrderStrategy bulkOrderStrategy;

    public OnlineStore(PaymentService paymentService, DiscountStrategy discountStrategy, BulkOrderStrategy bulkOrderStrategy) {
        this.paymentService = paymentService;
        this.discountStrategy = discountStrategy;
        this.bulkOrderStrategy = bulkOrderStrategy;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

//    public void processOrder(String product, int quantity, double price, String customer, boolean paymentReceived, boolean inStock) {
//        if (inStock) {
//            if (paymentReceived) {
//                Map<String, Object> order = new HashMap<>();
//                order.put("product", product);
//                order.put("quantity", quantity);
//                order.put("price", price);
//                order.put("customer", customer);
//
//                double totalPrice = price * quantity;
//                totalSales += totalPrice;
//
//                System.out.println("Processing order: " + order);
//                System.out.println("Total price for this order: $" + totalPrice);
//                orders.add(order);
//
//                if (totalPrice > 500) {
//                    System.out.println("This order qualifies for a 10% discount next time!");
//                }
//
//                if (product.equals("Laptop")) {
//                    if (quantity > 3) {
//                        System.out.println("Bulk order for Laptops processed!");
//                    }
//                }
//
//                System.out.println("Order processed for customer: " + customer + ". Total sales now: $" + totalSales);
//            } else {
//                System.out.println("Payment not received for customer: " + customer + ". Cannot process order for " + product);
//            }
//        } else {
//            System.out.println("Product " + product + " is not in stock.");
//        }
//    } -> так как эти процедуры вынесены за этот метод, то сам метод становится проще

    private List<Product> getActualProductList(List<Product> productList) {
        List<Product> actualProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.isInStock()) {
                actualProductList.add(product);
            }
        }
        return actualProductList;
    }

    public void processOrder() {
        for (Order order : orders) {
            System.out.println("### Start processing Order: " + order.getNumber() + " ###");

            // Шаг 1: сформировать список товаров в наличии
            System.out.println("Start preparing actual product list for Order " + order.getNumber());

            // Шаг 2: обновляем заказ актуальным списком товаров в наличии
            List<Product> actualProductList = getActualProductList(order.getProductList());
            order.setProductList(actualProductList);
            System.out.println("Actual list for Order: " + order.getNumber());
            order.printProductList();

            if (actualProductList.isEmpty()) {
                System.out.println("Order does not have products");
            } else {

                // Шаг 3: вычисляем скидку на основании общей цены
                System.out.println("Start calculating discount for Order  " + order.getNumber());
                double finalPrice = discountStrategy.applyDiscount(order.calculateTotalPrice());
                order.setTotalPrice(finalPrice);
                System.out.println("Final price for Order: " + order.getNumber() + " is " + finalPrice);

                // Шаг 4: Отправка запроса на покупку оптом
                System.out.println("Start preparing actual product list for Order " + order.getNumber());
                bulkOrderStrategy.createBulkOrder(order);
                System.out.println("Bulk order checked for Order " + order.getNumber());
            }

            System.out.println("### Stop processing Order: " + order.getNumber() + " ###");
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        OnlineStore store = new OnlineStore();
//        store.processOrder("Laptop", 1, 1200, "John Doe", true, true);
//        store.processOrder("Smartphone", 2, 800, "Alice Smith", true, false);
//        store.processOrder("Laptop", 5, 1200, "Bob Johnson", true, true);
//    }
}