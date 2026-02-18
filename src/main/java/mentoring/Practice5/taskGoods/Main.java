package mentoring.Practice5.taskGoods;

public class Main {
    public static void main(String[] args) {
        Item mug = new Item("Кружка", 100, 2);
        Item microphone = new Electronics("Микрофон", 10000, 1);
        Item dress = new Clothes("Платье", 5000, 3);

        Manager kostya = new Manager();

        kostya.manage(mug);
        kostya.manage(microphone);
        kostya.manage(dress);

    }
}
