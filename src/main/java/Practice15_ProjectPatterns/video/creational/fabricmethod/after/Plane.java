package Practice15_ProjectPatterns.video.creational.fabricmethod.after;

class Plane extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by sky in a baggage.");
        // по нему можно передвигаться не только на самолете, но и транспорте, который летает
    }
}