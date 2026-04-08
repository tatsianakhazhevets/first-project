package no_more_manual_level_up_automation.practice_six.oop_principles.dish;

import java.util.HashSet;
import java.util.Set;

public class Menu {

    private Set<Dish> dishes;

    public Menu() {
        this.dishes = new HashSet<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void printDescription() {
        for (Dish dish : dishes) {
            dish.provideDescription();
        }
    }
}