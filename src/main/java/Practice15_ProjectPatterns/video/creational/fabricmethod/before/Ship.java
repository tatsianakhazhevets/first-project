package Practice15_ProjectPatterns.video.creational.fabricmethod.before;

class Ship extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by sea in a container.");
    }
}
