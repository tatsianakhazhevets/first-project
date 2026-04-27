package no_more_manual_level_up_automation.practice_six.oop_principles.dish;

public class Drink extends Dish {

    private double volume;

    public Drink(String title, double volume) {
        super(title);
        this.volume = volume;
    }

    @Override
    public void provideDescription() {
        System.out.println(getTitle() + " has volume " + this.volume);
    }
}