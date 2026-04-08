package no_more_manual_level_up_automation.practice_six.oop_principles.pet;

public class Dog extends Pet {
    @Override
    public void feed() {
        System.out.println("Dog eats dry food");
    }

    @Override
    public void interact() {
        System.out.println("Dog walks");
    }
}