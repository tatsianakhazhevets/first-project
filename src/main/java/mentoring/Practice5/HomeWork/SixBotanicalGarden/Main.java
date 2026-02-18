package mentoring.Practice5.HomeWork.SixBotanicalGarden;

public class Main {
    public static void main(String[] args) {
        Orchid orchid = new Orchid("Орхидея");
        Cactus cactus = new Cactus("Кактус");

        BotanicalGarden botanicalGarden = new BotanicalGarden();

        botanicalGarden.showHowToCare(orchid);

        botanicalGarden.showHowToCare(cactus);
    }
}
