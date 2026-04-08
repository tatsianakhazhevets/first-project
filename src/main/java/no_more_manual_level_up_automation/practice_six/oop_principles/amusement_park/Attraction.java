package no_more_manual_level_up_automation.practice_six.oop_principles.amusement_park;

public abstract class Attraction {

    private String name;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void manage();
}