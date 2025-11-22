package Practice15_ProjectPatterns.video.behavioral.mediator.after;

public class Thermostat {

    private Mediator mediator;

    public void setTemperature(int temperature) {
        System.out.println("Temperature set to " + temperature + "C");
    }

//    public void term() {
//        mediator.notify(this, "morning");
//    }
}