package Practice5.HomeWork.ThreeDish;

public class HotDish extends Dish{

    private final int DEFAULT_TEMPERATURE = 60;
    private int temperature;

    public HotDish(String name) {
        super(name);
        this.temperature = DEFAULT_TEMPERATURE;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Температура горячего блюда: " + this.temperature + "°C");
    }
}
