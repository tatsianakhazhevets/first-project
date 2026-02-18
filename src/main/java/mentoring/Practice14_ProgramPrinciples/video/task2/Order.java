package mentoring.Practice14_ProgramPrinciples.video.task2;

import java.util.List;

public class Order {
    private static int maxNumber = 1;
    private int number = maxNumber++;
    private List<Product> productList;
    private String customer;
    private boolean isPaid;
    private double totalPrice;

    public Order(List<Product> productList, String customer, boolean isPaid) {
        this.productList = productList;
        this.customer = customer;
        this.isPaid = isPaid;

    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getCustomer() {
        return customer;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void makePayment() {
        this.isPaid = true;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumber() {
        return number;
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Product product : productList) {
            sum += product.getPrice() * product.getQuantity();
        }
        return sum;
    }

    public void printProductList() {
        System.out.println("Order: " + number);
        System.out.println();

        for (Product product : this.productList) {
            System.out.println("Product: " + product.getName());
        }
    }
}