package Practice8.HomeWork.task_7;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Один", 1);

        pair.printPair();

        pair.setFistType("Два");
        pair.setSecondType(2);
        pair.printPair();


    }
}
