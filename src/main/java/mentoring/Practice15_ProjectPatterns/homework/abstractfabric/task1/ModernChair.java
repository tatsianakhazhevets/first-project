package mentoring.Practice15_ProjectPatterns.homework.abstractfabric.task1;

public class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидеть на современном стуле можно в развалку.");
    }
}