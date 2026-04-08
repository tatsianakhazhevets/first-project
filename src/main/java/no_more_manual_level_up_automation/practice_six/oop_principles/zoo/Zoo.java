package no_more_manual_level_up_automation.practice_six.oop_principles.zoo;

import java.util.HashSet;
import java.util.Set;

public class Zoo {

    private Set<Animal> animals;

    public Zoo() {
        this.animals = new HashSet<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showBehavior() {
        for (Animal animal : animals) {
            animal.makeSound();
            animal.moveAround();
        }
    }
}