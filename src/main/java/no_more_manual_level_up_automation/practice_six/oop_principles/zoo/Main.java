package no_more_manual_level_up_automation.practice_six.oop_principles.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant("Big Elephant");
        Animal bird = new Bird("Little Bird");
        zoo.addAnimal(elephant);
        zoo.addAnimal(bird);
        zoo.showBehavior();
    }
}