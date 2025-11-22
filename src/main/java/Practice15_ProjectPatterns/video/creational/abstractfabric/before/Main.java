package Practice15_ProjectPatterns.video.creational.abstractfabric.before;

public class Main {
    public static void main(String[] args) {
        Button button;
        Checkbox checkbox;
        String osType = "Windows";

        if("Windows".equals(osType)) {
            button = new WindowsButton();  // вызов фабричного метода
            checkbox = new WindowsCheckbox(); // вызов фабричного метода
            // если хотим что-то добавить, то этот вариант будет модификацией, а не расширением
            // image = new WindowsImage();
            // а в новом варианте просто добавим новый класс Image и метод в фактори
        } else {
            button = new MacOSButton(); // вызов фабричного метода
            checkbox = new MacOSCheckbox(); // вызов фабричного метода
        }

        button.paint();
        checkbox.paint();
    }
}