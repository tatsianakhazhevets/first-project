package mentoring.Practice15_ProjectPatterns.homework.fabricmethod.task1;

public class CarCreator extends TransportCreator {
    @Override
    public Moveable createTransport() {
        return new Car();
    }
}