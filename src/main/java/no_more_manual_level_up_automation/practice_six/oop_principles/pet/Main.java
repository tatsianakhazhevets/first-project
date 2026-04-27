package no_more_manual_level_up_automation.practice_six.oop_principles.pet;

public class Main {
    public static void main(String[] args) {
        Zootechnician zootechnician = new Zootechnician();
        Pet dog = new Dog();
        Pet cat = new Cat();
        zootechnician.add(dog);
        zootechnician.add(cat);
        zootechnician.act();
    }
}