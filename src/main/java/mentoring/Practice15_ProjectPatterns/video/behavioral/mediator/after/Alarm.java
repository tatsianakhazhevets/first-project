package mentoring.Practice15_ProjectPatterns.video.behavioral.mediator.after;

public class Alarm {
    private Mediator mediator;

    public void activate() {
        System.out.println("Alarm activated");
    }

    public void deactivate() {
        System.out.println("Alarm deactivated");
    }

    public void alarm() {
        mediator.notify(this, "evening");
        // sender = this , то есть я нотифицирую, аларм
        // event = "evening"
    }
}