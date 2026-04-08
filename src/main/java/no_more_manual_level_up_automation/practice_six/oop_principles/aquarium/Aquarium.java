package no_more_manual_level_up_automation.practice_six.oop_principles.aquarium;

import java.util.HashSet;
import java.util.Set;

public class Aquarium {

    private Set<SeaCreature> seaCreatures;

    public Aquarium() {
        this.seaCreatures = new HashSet<>();
    }

    public void addSeaCreature(SeaCreature seaCreature) {
        seaCreatures.add(seaCreature);
    }

    public void demonstrateBehaviour() {
        for (SeaCreature seaCreature : seaCreatures) {
            seaCreature.move();
        }
    }
}