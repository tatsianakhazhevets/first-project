package Practice15_ProjectPatterns.homework.abstractfabric.task2;

public class MacOsFabric implements GuiAbstractFabric {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacOsMenu();
    }
}