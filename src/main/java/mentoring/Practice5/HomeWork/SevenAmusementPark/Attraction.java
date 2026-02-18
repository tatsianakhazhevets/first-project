package mentoring.Practice5.HomeWork.SevenAmusementPark;

public class Attraction implements Mainrainable {

    private String name;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void info() {
        System.out.print("Ощущения: ");
    }

    @Override
    public void maintain() {
        System.out.print("Обслуживание: ");
    }
}
