package Practice5.HomeWork.SixBotanicalGarden;

public class Orchid extends Plant {

    public Orchid(String name) {
        super(name);
    }

    @Override
    public void care() {
        super.care();
        System.out.println("высокая влажность и тень");
    }

}
