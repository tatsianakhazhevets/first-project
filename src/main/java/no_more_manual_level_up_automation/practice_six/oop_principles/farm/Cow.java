package no_more_manual_level_up_automation.practice_six.oop_principles.farm;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " requires grazing");
    }

    @Override
    public void produce() {
        System.out.println(getName() + " produces milk");
    }
}