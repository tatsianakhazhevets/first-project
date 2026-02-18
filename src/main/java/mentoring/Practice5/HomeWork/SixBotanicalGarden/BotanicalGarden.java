package mentoring.Practice5.HomeWork.SixBotanicalGarden;

public class BotanicalGarden {

    private Plant plant;

    public void showHowToCare(Plant plant) {
        System.out.println("Наименование: " + plant.getName());
        plant.care();
    }
}
