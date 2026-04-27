package no_more_manual_level_up_automation.practice_six.oop_principles.farm;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class Farm extends SystemManager<Animal> {

    @Override
    public void act() {
        for (Animal animal : items) {
            animal.care();
            animal.produce();
        }
    }
}