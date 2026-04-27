package no_more_manual_level_up_automation.practice_six.oop_principles.aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        SeaCreature shark = new Shark();
        SeaCreature starfish = new Starfish();
        aquarium.add(shark);
        aquarium.add(starfish);
        aquarium.act();
    }
}