package mentoring.Practice15_ProjectPatterns.homework.builder.task2;

public class Main {
    public static void main(String[] args) {
        Character characterOne = new Character.Builder()
                .setHealth("level 10")
                .setMagic("level 5")
                .build();
        System.out.println(characterOne);

        Character characterTwo = new Character.Builder()
                .setMagic("level 5")
                .setHealth("level 6")
                .setArmor("level 10")
                .setDamage("level 3")
                .build();
        System.out.println(characterTwo);

        Character characterThree = new Character.Builder()
                .setDamage("level 1")
                .build();
        System.out.println(characterThree );
    }
}