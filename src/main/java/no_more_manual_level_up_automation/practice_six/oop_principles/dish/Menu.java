package no_more_manual_level_up_automation.practice_six.oop_principles.dish;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class Menu extends SystemManager<Dish> {

    @Override
    public void act() {
        for (Dish dish : items) {
            dish.provideDescription();
        }
    }
}