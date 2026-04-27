package no_more_manual_level_up_automation.practice_six.oop_principles.zoo;

import java.util.Objects;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void makeSound();

    public abstract void moveAround();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}