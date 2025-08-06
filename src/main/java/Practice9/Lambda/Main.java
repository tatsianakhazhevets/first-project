package Practice9.Lambda;

public class Main {
    public static void main(String[] args) {
        // анонимный класс - как бы да, и как бы нет, к нему нельзя обратиться по имени, так как его нет
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет, мир!");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("Привет, мир!");

        r2.run();

    }
}
