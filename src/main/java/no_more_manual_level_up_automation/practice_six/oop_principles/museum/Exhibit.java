package no_more_manual_level_up_automation.practice_six.oop_principles.museum;

public abstract class Exhibit {

    private String name;

    public Exhibit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void care();
}