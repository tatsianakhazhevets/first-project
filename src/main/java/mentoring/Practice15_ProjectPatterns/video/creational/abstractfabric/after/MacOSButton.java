package mentoring.Practice15_ProjectPatterns.video.creational.abstractfabric.after;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a MacOS button.");
    }
}