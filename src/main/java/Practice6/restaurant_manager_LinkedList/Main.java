package Practice6.restaurant_manager_LinkedList;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        // manager.addNewOrder("Картошка фри");
        // manager.addNewOrder("Спагетти");
        // manager.addNewOrder("Маргарита");
        // manager.printOrders();

        // System.out.println();

        // manager.addNewOrder("Спагетти");
        // manager.printOrders();

        // System.out.println();

        // manager.getNextOrderForProcess();
        // manager.printOrders();


        manager.addNewOrder("Картошка фри");
        manager.addNewOrder("Спагетти");
        manager.addNewOrder("Маргарита");
        manager.printOrders();

        System.out.println();

        manager.deleteOrder("Спагетти");
        manager.printOrders();

            }
}
