package Practice15_ProjectPatterns.video.creational.abstractfabric.before;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a Windows button.");
    }
}
