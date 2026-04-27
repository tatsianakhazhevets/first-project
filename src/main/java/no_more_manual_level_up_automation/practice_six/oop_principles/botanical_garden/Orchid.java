package no_more_manual_level_up_automation.practice_six.oop_principles.botanical_garden;

public class Orchid extends Plant {

    public Orchid(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " needs shade and high humidity");
    }
}