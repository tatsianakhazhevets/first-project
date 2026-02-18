package mentoring.Practice15_ProjectPatterns.video.creational.abstractfabric.after;

public class Main {
    public static void main(String[] args) {
        // когда связываем несколько сущностей, то создаем новую сущность
        //        Button button;
        //        Checkbox checkbox;
        GUIFactory guiFactory;
        String osType = "Windows";

        if("Windows".equals(osType)) {
            guiFactory = new WindowsFactory();
//            button = new WindowsButton();  // вызов фабричного метода
//            checkbox = new WindowsCheckbox(); // вызов фабричного метода
        } else {
            guiFactory = new WindowsFactory();
//            button = new MacOSButton(); // вызов фабричного метода
//            checkbox = new MacOSCheckbox(); // вызов фабричного метода
        }

//        button.paint();
//        checkbox.paint();
        guiFactory.createButton().paint();
        guiFactory.createCheckbox().paint();
    }
}

