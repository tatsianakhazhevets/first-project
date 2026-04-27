package no_more_manual_level_up_automation.practice_six.oop_principles.amusement_park;

public class Main {
    public static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark();
        Attraction rides = new Rides("Rides 8");
        Attraction roller = new Roller("Kid's Roller");
        amusementPark.addAttraction(rides);
        amusementPark.addAttraction(roller);
        amusementPark.manageAttractions();
    }
}