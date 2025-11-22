package Practice15_ProjectPatterns.video.structural.decorator.before;

public class Main {
    public static void main(String[] args) {
        CoffeeWithMilkAndSugar coffee = new CoffeeWithMilkAndSugar();
        System.out.println("Cost: $" + coffee.cost());

        /*
        если завтра начнем расширение кофейни и добавится 100 топингов:
        нужно будет создать класс для всех возможных комбинаций топинга

        количество комбинаторных комбинаций будет расти-расти и расти
         */
    }
}