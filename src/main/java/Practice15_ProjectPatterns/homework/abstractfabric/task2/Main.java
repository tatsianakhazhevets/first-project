package Practice15_ProjectPatterns.homework.abstractfabric.task2;

public class Main {
    public static void main(String[] args) {
        GuiAbstractFabric guiAbstractFabric;
        String type = "Windows";

        if(type.equalsIgnoreCase("macos")) {
            guiAbstractFabric = new WindowsFabric();
        } else {
            guiAbstractFabric = new MacOsFabric();
        }

        guiAbstractFabric.createButton().paint();
        guiAbstractFabric.createWindow().paint();
        guiAbstractFabric.createMenu().paint();
    }
}