package mentoring.Practice15_ProjectPatterns.homework.abstractfabric.task1;

public class ModernFabric implements FurnitureFabric {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}