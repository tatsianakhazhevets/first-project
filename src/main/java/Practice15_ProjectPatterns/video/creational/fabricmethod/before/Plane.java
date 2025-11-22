package Practice15_ProjectPatterns.video.creational.fabricmethod.before;

class Plane extends Transport{
    @Override
    void deliver() {
        System.out.println("Deliver by sky in a baggage.");
    }
}