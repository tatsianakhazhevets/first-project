package mentoring.Practice15_ProjectPatterns.homework.fabricmethod.task2;

public class PistolFabric extends WeaponFabric {
    @Override
    public Weapon createWeapon() {
        return new Pistol();
    }
}