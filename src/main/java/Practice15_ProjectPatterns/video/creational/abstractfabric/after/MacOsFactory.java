package Practice15_ProjectPatterns.video.creational.abstractfabric.after;

public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}