package Practice15_ProjectPatterns.homework.abstractfabric.task1;

public class ClassicTable implements Table{
    @Override
    public void use() {
        System.out.println("Стол в классическом стиле нужно использовать в офисе.");
    }
}