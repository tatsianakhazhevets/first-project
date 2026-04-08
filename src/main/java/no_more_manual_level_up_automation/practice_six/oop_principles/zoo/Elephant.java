package no_more_manual_level_up_automation.practice_six.oop_principles.zoo;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets");
    }


    @Override
    public void moveAround() {
        System.out.println(getName() + " walks");
    }
}