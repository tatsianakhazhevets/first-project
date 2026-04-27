package no_more_manual_level_up_automation.practice_six.oop_principles.zoo;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class Zoo extends SystemManager<Animal> {
    @Override
    public void act() {
        for (Animal animal : items) {
            animal.makeSound();
            animal.moveAround();
        }
    }
}