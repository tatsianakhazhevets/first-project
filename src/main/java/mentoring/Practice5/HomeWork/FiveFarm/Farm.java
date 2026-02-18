package mentoring.Practice5.HomeWork.FiveFarm;

public class Farm {

    private FarmAnimal farmAnimal;

    public void gerAnimalDescription(FarmAnimal farmAnimal) {
        System.out.println("Наименование " + farmAnimal.getName());
        farmAnimal.feed();
        farmAnimal.care();
        farmAnimal.produce();
    }
}
