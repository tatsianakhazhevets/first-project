package no_more_manual_level_up_automation.practice_six.oop_principles.amusement_park;

import java.util.Objects;

public abstract class Attraction {

    private String name;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void manage();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Attraction that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}