package mentoring.Practice5.HomeWork.TwoPet;

public class Cat extends Pet {

    @Override
    protected void feed() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    protected void interact() {
        System.out.println("Кошка играет");
    }
}
