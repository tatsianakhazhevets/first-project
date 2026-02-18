package mentoring.Practice15_ProjectPatterns.video.creational.fabricmethod.after;

class Truck extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by lend in a box.");
        // по нему можно передвигаться не только на грузовике, но и транспорте, который едет по земле
    }
}