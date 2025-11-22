package Practice15_ProjectPatterns.video.behavioral.mediator.after;

public class Light {

    private Mediator mediator;

    public void turnOn() {
        System.out.println("Light turned on");
    }

    public void turnOff() {
        System.out.println("Light turned off");
    }

//    public void light() {
//        mediator.notify(this, "morning");
//    }
}
