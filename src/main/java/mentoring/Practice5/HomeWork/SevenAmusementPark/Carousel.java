package mentoring.Practice5.HomeWork.SevenAmusementPark;

public class Carousel extends Attraction {

    public Carousel(String name) {
        super(name);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("медленно и раслабленно.");
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("техническое обслуживание");
    }
}
