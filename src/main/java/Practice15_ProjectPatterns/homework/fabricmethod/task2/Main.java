package Practice15_ProjectPatterns.homework.fabricmethod.task2;

public class Main {
    public static void main(String[] args) {
        WeaponFabric fabric;
        String weatonType = "Pistol";

        if(weatonType.equalsIgnoreCase("sword")) {
            fabric = new SwordFabric();
        } else if(weatonType.equalsIgnoreCase("bow")) {
            fabric = new BowFabric();
        } else {
            fabric = new PistolFabric();
        }

        fabric.printUse();
    }
}