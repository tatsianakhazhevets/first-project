package Practice15_ProjectPatterns.homework.abstractfabric.task1;

public class Main {
    public static void main(String[] args) {
        FurnitureFabric furnitureFabric;
        String type = "modern";

        if(type.equalsIgnoreCase("classic")) {
            furnitureFabric = new ClassicFabric();
        } else {
            furnitureFabric = new ModernFabric();
        }

        furnitureFabric.createChair().sit();
        furnitureFabric.createTable().use();

    }
}