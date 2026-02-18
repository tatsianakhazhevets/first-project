package mentoring.Practice15_ProjectPatterns.homework.abstractfabric.task2;

public class WindowsFabric implements GuiAbstractFabric {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}