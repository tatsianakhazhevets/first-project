package no_more_manual_level_up_automation.practice_six.oop_principles.botanical_garden;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Plant orchid = new Orchid("Lovely Orchid");
        Plant cactus = new Cactus("Just Cactus");
        botanicalGarden.add(orchid);
        botanicalGarden.add(cactus);
        botanicalGarden.act();
    }
}