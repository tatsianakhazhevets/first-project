package no_more_manual_level_up_automation.practice_six.oop_principles.museum;

public class Manuscript extends Exhibit {

    public Manuscript(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " requires controlled humidity and temperature");
    }
}