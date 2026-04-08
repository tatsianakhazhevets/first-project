package no_more_manual_level_up_automation.practice_six.oop_principles.dish;

public class HotDish extends Dish {

    private double temperature;

    public HotDish(String title, double temperature) {
        super(title);
        this.temperature = temperature;
    }

    @Override
    public void provideDescription() {
        System.out.println(getTitle() + " has temperature " + this.temperature);
    }
}