package mentoring.Practice5.taskTransport;

public class Ship extends Transport{
    public Ship(){
       super(40, 5000);
    }

    @Override
    void start() {
        System.out.println("Корабль поплыл");
    }
}
