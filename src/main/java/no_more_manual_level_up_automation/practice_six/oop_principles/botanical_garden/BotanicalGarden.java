package no_more_manual_level_up_automation.practice_six.oop_principles.botanical_garden;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class BotanicalGarden extends SystemManager<Plant> {

    @Override
    public void act() {
        for (Plant plant : items) {
            plant.care();
        }
    }
}