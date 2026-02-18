package mentoring.Practice14_ProgramPrinciples.video.task2;

public class Product {
    private String name;
    private double price;
    private boolean isInStock;
    private int quantity;

    public Product(String name, double price, int quantity, boolean isInStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isInStock() {
        return isInStock;
    }
}