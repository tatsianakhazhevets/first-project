package Practice15_ProjectPatterns.homework.abstractfabric.task2;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Кнопка для Windows");
    }
}