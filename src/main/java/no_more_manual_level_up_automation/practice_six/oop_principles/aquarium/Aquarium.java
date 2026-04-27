package no_more_manual_level_up_automation.practice_six.oop_principles.aquarium;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class Aquarium extends SystemManager<SeaCreature> {

    @Override
    public void act() {
        for (SeaCreature seaCreature : items) {
            seaCreature.move();
        }
    }
}