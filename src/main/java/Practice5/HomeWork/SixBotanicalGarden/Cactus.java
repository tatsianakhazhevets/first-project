package Practice5.HomeWork.SixBotanicalGarden;

public class Cactus  extends Plant {

    public Cactus(String name) {
        super(name);
    }

    @Override
    public void care() {
        super.care();
        System.out.println("много света, редкий полив");
    }
}
