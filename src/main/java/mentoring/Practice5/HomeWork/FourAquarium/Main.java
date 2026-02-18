package mentoring.Practice5.HomeWork.FourAquarium;

public class Main {
    public static void main(String[] args) {

        SeaCreature shark = new Shark();
        SeaCreature starfish = new Starfish();

        Aquarium aquarium = new Aquarium();

        aquarium.moveSeaCreature(shark);
        aquarium.moveSeaCreature(starfish);

    }
}
