package no_more_manual_level_up_automation.practice_six.oop_principles.museum;

public class Sculpture extends Exhibit {

    public Sculpture(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " needs regular restoration");
    }
}