package no_more_manual_level_up_automation.practice_six.oop_principles.botanical_garden;

public class Cactus extends Plant {

    public Cactus(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " requires a lot of light and rare watering");
    }
}