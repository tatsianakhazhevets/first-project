package Practice5.HomeWork.SixBotanicalGarden;

public class Plant implements Careable {

    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void care() {
        System.out.print("Уход: ");
    }

}
