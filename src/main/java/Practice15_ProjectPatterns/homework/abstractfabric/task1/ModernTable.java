package Practice15_ProjectPatterns.homework.abstractfabric.task1;

public class ModernTable implements Table{
    @Override
    public void use() {
        System.out.println("Стол в современном стиле нужно использовать дома.");
    }
}