package no_more_manual_level_up_automation.practice_six.oop_principles.dish;

public abstract class Dish {

    private String title;

    public Dish(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public abstract void provideDescription();
}