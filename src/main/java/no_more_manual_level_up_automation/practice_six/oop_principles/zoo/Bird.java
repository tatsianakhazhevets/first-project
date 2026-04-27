package no_more_manual_level_up_automation.practice_six.oop_principles.zoo;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirps");
    }


    @Override
    public void moveAround() {
        System.out.println(getName() + " flies");
    }
}