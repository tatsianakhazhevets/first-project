package no_more_manual_level_up_automation.practice_six.oop_principles.farm;

public class Chicken extends Animal {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " requires grain");
    }

    @Override
    public void produce() {
        System.out.println(getName() + " produces eggs");
    }
}