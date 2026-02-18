package mentoring.Practice15_ProjectPatterns.video.creational.builder.after;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(String topping, String sauce, String dough) {
        this.topping = topping;
        this.sauce = sauce;
        this.dough = dough;
    }

    public Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        /*
        Если используется классический сеттер, то способ создания объекта через билдер:

        Pizza pizza = new Pizza.Builder();
        pizza.setDough();
        pizza.setSauce();
        pizza.setTopping();

        Использование цепочки вызовов:
        new Pizza.Builder()          // возвращался тип данных Билдер на каждом из этапов
        .setDough()
        .setSauce()
        .setTopping();

        Такой хак часто используют при проектировании автотестов!!!
         */

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}