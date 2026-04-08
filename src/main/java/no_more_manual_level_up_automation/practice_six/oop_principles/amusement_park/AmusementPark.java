package no_more_manual_level_up_automation.practice_six.oop_principles.amusement_park;

import java.util.HashSet;
import java.util.Set;

public class AmusementPark {

    private Set<Attraction> attractions;

    public AmusementPark() {
        this.attractions = new HashSet<>();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void manageAttractions() {
        for (Attraction attraction : attractions) {
            attraction.manage();
        }
    }
}