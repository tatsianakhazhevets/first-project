package mentoring.Practice5.HomeWork.FiveFarm;

public class Chicken extends FarmAnimal {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public void feed(){
        super.feed();
        System.out.println("зерном");
    }

    public void care() {
        super.care();
        System.out.println("покой");
    }

    public void produce() {
        super.produce();
        System.out.println("яйца");
    }


}
