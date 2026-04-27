package no_more_manual_level_up_automation.practice_six.oop_principles.botanical_garden;

public abstract class Plant {

    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void care();
}