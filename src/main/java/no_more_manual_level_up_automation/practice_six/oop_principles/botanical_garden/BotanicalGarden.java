package no_more_manual_level_up_automation.practice_six.oop_principles.botanical_garden;

import java.util.HashSet;
import java.util.Set;

public class BotanicalGarden {

    private Set<Plant> plants;

    public BotanicalGarden() {
        this.plants = new HashSet<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void managePlants() {
        for (Plant plant : plants) {
            plant.care();
        }
    }
}