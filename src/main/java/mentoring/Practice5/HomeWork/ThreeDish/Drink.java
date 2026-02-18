package mentoring.Practice5.HomeWork.ThreeDish;

public class Drink extends Dish {

    private final int DEFAULT_VOLUME = 250;
    private int volume;


    public Drink(String name) {
        super(name);
        this.volume = DEFAULT_VOLUME;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Объем напитка: " + this.volume + "мл");
    }
}
