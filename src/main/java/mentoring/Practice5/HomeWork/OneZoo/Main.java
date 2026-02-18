package mentoring.Practice5.HomeWork.OneZoo;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal elephant = new Elephant();

        Zoo zoo = new Zoo();

        zoo.setAnimal(bird);
        zoo.behavior();
        zoo.setAnimal(elephant);
        zoo.behavior();
    }
}
