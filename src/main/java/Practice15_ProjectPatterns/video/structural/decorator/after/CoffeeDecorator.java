package Practice15_ProjectPatterns.video.structural.decorator.after;

public class CoffeeDecorator implements Coffee{
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }
}