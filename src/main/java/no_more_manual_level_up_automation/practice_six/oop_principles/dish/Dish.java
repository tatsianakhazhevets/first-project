package no_more_manual_level_up_automation.practice_six.oop_principles.dish;

import java.util.Objects;

public abstract class Dish {

    private String title;

    public Dish(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public abstract void provideDescription();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dish dish)) return false;
        return Objects.equals(title, dish.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}