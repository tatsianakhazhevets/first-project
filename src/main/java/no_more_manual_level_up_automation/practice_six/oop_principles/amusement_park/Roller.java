package no_more_manual_level_up_automation.practice_six.oop_principles.amusement_park;

public class Roller extends Attraction {

    public Roller(String name) {
        super(name);
    }

    @Override
    public void manage() {
        System.out.println(getName() + " needs the maintenance");
    }
}