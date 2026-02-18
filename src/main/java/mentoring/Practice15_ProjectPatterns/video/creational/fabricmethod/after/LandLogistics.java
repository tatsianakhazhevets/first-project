package mentoring.Practice15_ProjectPatterns.video.creational.fabricmethod.after;

public class LandLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}