package mentoring.Practice15_ProjectPatterns.video.creational.fabricmethod.after;

public class SeaLogistic extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}