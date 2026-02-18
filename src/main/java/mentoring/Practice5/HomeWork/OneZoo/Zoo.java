package mentoring.Practice5.HomeWork.OneZoo;

public class Zoo {
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void behavior() {
        animal.makeSound();
        animal.move();
    }
}
