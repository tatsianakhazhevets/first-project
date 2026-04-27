package no_more_manual_level_up_automation.practice_six.oop_principles.botanical_garden;

import java.util.Objects;

public abstract class Plant {

    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void care();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Plant plant)) return false;
        return Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}