package Practice15_ProjectPatterns.homework.fabricmethod.task1;

public class BicycleCreator extends TransportCreator {
    @Override
    public Moveable createTransport() {
        return new Bicycle();
    }
}