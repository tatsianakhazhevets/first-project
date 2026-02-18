package mentoring.Practice2;

public class Product {
    String name;
    double price;

    Product(String newName, double newPrice){
        this.name = newName;
        this.price = newPrice;
    }

    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double applyDiscount(double discount){
        return this.price = this.price - (this.price * discount / 100);
    }

    public void printInfo(){
        System.out.println("Товар: " + this.name + ", Цена: " + this.price + "руб.");
    }
}
