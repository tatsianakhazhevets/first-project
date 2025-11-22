package Practice15_ProjectPatterns.homework.fabricmethod.task2;

public class SwordFabric extends WeaponFabric {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}