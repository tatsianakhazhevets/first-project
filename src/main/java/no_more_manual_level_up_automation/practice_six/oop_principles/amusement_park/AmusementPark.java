package no_more_manual_level_up_automation.practice_six.oop_principles.amusement_park;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class AmusementPark extends SystemManager<Attraction> {

    @Override
    public void act() {
        for (Attraction attraction : items) {
            attraction.manage();
        }
    }
}