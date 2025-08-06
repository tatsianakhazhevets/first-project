package Practice5.HomeWork.SevenAmusementPark;

public class Main {
    public static void main(String[] args) {
        RollerCoaster rollerCoaster = new RollerCoaster("Американские горки");
        Carousel carousel = new Carousel("Карусель");

        AmusementPark amusementPark = new AmusementPark();

        amusementPark.showInfo(rollerCoaster);
        amusementPark.showInfo(carousel);

    }
}
