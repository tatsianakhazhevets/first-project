package Practice15_ProjectPatterns.video.structural.decorator.after;

public class Main {
    public static void main(String[] args) {
//        CoffeeWithMilkAndSugar coffee = new CoffeeWithMilkAndSugar();
//        System.out.println("Cost: $" + coffee.cost());

        /*
        если завтра начнем расширение кофейни и добавится 100 топингов:
        нужно будет создать класс для всех возможных комбинаций топинга
         */

        /*
        Идея решения:
        Давайте сделаем простой кофе и реализуем декораторы(слои для добавления к кофе)

        Использование:
        1) цель: сделать кофе с молоком
        - беру простой кофе
        - декорирую кофе молоком

        Декорировать - добавление нового слоя
         */

        //1) цель: сделать кофе с молоком
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.cost());

        //2) цель: сделать кофе с сахаром
        Coffee coffeeWithSugar = new SimpleCoffee();
        coffeeWithSugar = new SugarDecorator(coffeeWithSugar);
        System.out.println(coffeeWithSugar.cost());

        //3) цель: сделать кофе с сахаром и молоком
        Coffee coffeeWithSugarAndMilk = new SimpleCoffee(); // простой кофе
        coffeeWithSugarAndMilk = new SugarDecorator(coffeeWithSugarAndMilk); // простой кофе + сахар
        coffeeWithSugarAndMilk = new MilkDecorator(coffeeWithSugarAndMilk); // простой кофе + сахар + молоко
        System.out.println(coffeeWithSugarAndMilk.cost());
    }
}