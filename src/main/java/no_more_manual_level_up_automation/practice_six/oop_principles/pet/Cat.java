package no_more_manual_level_up_automation.practice_six.oop_principles.pet;

public class Cat extends Pet {
    @Override
    public void feed() {
        System.out.println("Cat eats wet food");
    }

    @Override
    public void interact() {
        System.out.println("Cat plays");
    }
}