package no_more_manual_level_up_automation.practice_six.oop_principles.farm;

import java.util.HashSet;
import java.util.Set;

public class Farm {

    private Set<Animal> animals;

    public Farm() {
        this.animals = new HashSet<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void manageAnimal() {
        for (Animal animal : animals) {
            animal.care();
            animal.produce();
        }
    }
}