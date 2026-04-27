package no_more_manual_level_up_automation.practice_six.oop_principles.pet;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class Zootechnician extends SystemManager<Pet> {
    @Override
    public void act() {
        for (Pet pet : items) {
            pet.feed();
            pet.interact();
        }
    }
}