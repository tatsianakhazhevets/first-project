package Practice5.HomeWork.SevenAmusementPark;

public class RollerCoaster extends Attraction {

    public RollerCoaster(String name) {
        super(name);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("быстро и страшно.");
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("проверка безопасности");
    }
}
