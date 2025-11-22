package Practice15_ProjectPatterns.video.creational.abstractfabric.after;

// абстрактная фабрика
public interface GUIFactory {
    Button createButton(); // фабричный метод
    Checkbox createCheckbox(); // фабричный метод
}