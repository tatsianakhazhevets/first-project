package mentoring.Practice15_ProjectPatterns.video.creational.builder.before;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(String topping, String sauce, String dough) {
        this.topping = topping;
        this.sauce = sauce;
        this.dough = dough;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}