package Practice15_ProjectPatterns.video.creational.abstractfabric.before;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a MacOS button.");
    }
}