package Practice15_ProjectPatterns.homework.abstractfabric.task1;

public class ClassicFabric implements FurnitureFabric {

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}