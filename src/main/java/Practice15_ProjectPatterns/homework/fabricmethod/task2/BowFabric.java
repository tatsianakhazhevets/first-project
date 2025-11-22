package Practice15_ProjectPatterns.homework.fabricmethod.task2;

public class BowFabric extends WeaponFabric {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}