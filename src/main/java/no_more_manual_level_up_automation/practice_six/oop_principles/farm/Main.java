package no_more_manual_level_up_automation.practice_six.oop_principles.farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Animal cow = new Cow("Covy Cow");
        Animal chicken = new Chicken("Chiky Chicken");
        farm.addAnimal(cow);
        farm.addAnimal(chicken);
        farm.manageAnimal();
    }
}