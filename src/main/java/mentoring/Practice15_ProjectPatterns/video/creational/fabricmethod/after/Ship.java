package mentoring.Practice15_ProjectPatterns.video.creational.fabricmethod.after;

class Ship extends Transport {
    @Override
    void deliver() {
        System.out.println("Deliver by sea in a container.");
        // по нему можно передвигаться не только на корабле, но и транспорте, который плавает
    }
}
