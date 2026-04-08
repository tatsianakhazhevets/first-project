package no_more_manual_level_up_automation.practice_six.oop_principles.pet;

import java.util.HashSet;
import java.util.Set;

public class Zootechnician {

    private Set<Pet> pets;

    public Zootechnician() {
        this.pets = new HashSet<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void interactWithPets() {
        for(Pet pet : pets) {
            pet.feed();
            pet.interact();
        }
    }
}