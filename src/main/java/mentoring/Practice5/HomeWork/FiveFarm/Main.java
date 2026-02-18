package mentoring.Practice5.HomeWork.FiveFarm;

public class Main {
    public static void main(String[] args) {

        FarmAnimal cow = new Cow ("Корова");
        FarmAnimal chicken = new Chicken("Курица");

        Farm farm = new Farm();

        farm.gerAnimalDescription(cow);

        farm.gerAnimalDescription(chicken);


    }
}
