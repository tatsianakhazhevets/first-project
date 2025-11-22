package Practice15_ProjectPatterns.homework.fabricmethod.task2;

public abstract class WeaponFabric {
    public abstract Weapon createWeapon();

    public void printUse() {
        Weapon weapon = createWeapon();
        weapon.use();
    }
}