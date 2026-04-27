package no_more_manual_level_up_automation.practice_six.oop_principles.museum;

import no_more_manual_level_up_automation.practice_six.oop_principles.SystemManager;

public class Museum extends SystemManager<Exhibit> {

    @Override
    public void act() {
        for (Exhibit exhibit : items) {
            exhibit.care();
        }
    }
}