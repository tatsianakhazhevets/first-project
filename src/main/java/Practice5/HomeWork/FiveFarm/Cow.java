package Practice5.HomeWork.FiveFarm;

public class Cow extends FarmAnimal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void feed(){
        super.feed();
        System.out.println("сеном");
    }

    public void care() {
        super.care();
        System.out.println("выпас");
    }

    public void produce() {
        super.produce();
        System.out.println("молоко");
    }
    
}
