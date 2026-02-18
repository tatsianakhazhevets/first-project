package mentoring.Practice15_ProjectPatterns.homework.fabricmethod.task1;

public abstract class TransportCreator {
    public abstract Moveable createTransport();

    public void describeMove(){
        Moveable moveable = createTransport();
        moveable.drive();
    }
}