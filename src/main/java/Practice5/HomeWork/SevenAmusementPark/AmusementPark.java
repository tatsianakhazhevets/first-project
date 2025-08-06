package Practice5.HomeWork.SevenAmusementPark;

public class AmusementPark {
    private Attraction attraction;

    public void showInfo(Attraction attraction) {
        System.out.println("Аттракцион: " + attraction.getName());
        attraction.info();
        attraction.maintain();
    }
}
