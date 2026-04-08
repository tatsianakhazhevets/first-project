package no_more_manual_level_up_automation.practice_six.oop_principles.zoo;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void makeSound();

    public abstract void moveAround();
}