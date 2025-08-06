package Practice5.HomeWork.TwoPet;

public class Dog extends Pet {
    @Override
    protected void feed() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    protected void interact() {
        System.out.println("Собака гуляет");
    }
}
