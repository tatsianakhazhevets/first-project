package mentoring.Practice5.taskTransport;

public class Plan extends Transport{
    public Plan(){
       super(900, 100000);
    }

    @Override
    void start() {
        System.out.println("Самолет полетел");
    }
}
