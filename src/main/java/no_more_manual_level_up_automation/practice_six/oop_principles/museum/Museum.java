package no_more_manual_level_up_automation.practice_six.oop_principles.museum;

import java.util.HashSet;
import java.util.Set;

public class Museum {

    private Set<Exhibit> exhibits;

    public Museum() {
        this.exhibits = new HashSet<>();
    }

    public void addExhibit(Exhibit exhibit) {
        exhibits.add(exhibit);
    }

    public void manageExhibits() {
        for (Exhibit exhibit : exhibits) {
            exhibit.care();
        }
    }
}