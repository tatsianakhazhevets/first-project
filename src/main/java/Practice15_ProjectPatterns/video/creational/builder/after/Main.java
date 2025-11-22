package Practice15_ProjectPatterns.video.creational.builder.after;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick", "tomato", "pepperoni");

        // Правила синтаксиса Java при создании объектов:
        // - строгий порядок параметров метода (конструктора)
        // запрет на пропуск параметра

        Pizza flexiblePizza = new Pizza.Builder()
                .setSauce("tomato")
                        .setTopping("pepperoni")
                                .build();


        System.out.println(pizza);

        System.out.println(flexiblePizza);
    }
}