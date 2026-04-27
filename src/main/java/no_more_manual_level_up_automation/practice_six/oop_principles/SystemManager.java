package no_more_manual_level_up_automation.practice_six.oop_principles;

import java.util.HashSet;
import java.util.Set;

public abstract class SystemManager<T> {

    protected Set<T> items;

    public SystemManager() {
        this.items = new HashSet<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public abstract void act();
}