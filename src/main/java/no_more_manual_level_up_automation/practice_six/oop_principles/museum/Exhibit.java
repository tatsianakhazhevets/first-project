package no_more_manual_level_up_automation.practice_six.oop_principles.museum;

import java.util.Objects;

public abstract class Exhibit {

    private String name;

    public Exhibit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void care();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Exhibit exhibit)) return false;
        return Objects.equals(name, exhibit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}