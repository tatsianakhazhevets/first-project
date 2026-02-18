package mentoring.Practice5.HomeWork.TwoPet;

public class PetManager {

    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void care() {
        pet.feed();
        pet.interact();
    }
}
