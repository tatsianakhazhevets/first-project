package Practice15_ProjectPatterns.homework.abstractfabric.task1;

public class ClassicChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Сидеть на классическом стуле нужно с прямой спиной.");
    }
}