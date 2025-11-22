package Practice15_ProjectPatterns.homework.fabricmethod.task1;

public class Main {
    public static void main(String[] args) {

        TransportCreator transportCreator;
        String type = "Bicycle";

        if(type.equalsIgnoreCase("car")) {
            transportCreator = new CarCreator();
        } else {
            transportCreator = new BicycleCreator();
        }

        transportCreator.describeMove();
    }
}
