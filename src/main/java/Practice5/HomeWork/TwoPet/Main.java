package Practice5.HomeWork.TwoPet;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();

        PetManager petManager = new PetManager();

        petManager.setPet(dog);
        petManager.care();
        petManager.setPet(cat);
        petManager.care();

    }
}
