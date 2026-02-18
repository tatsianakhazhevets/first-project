package mentoring.Practice9.HomeWork.FunctionalInterface.Task_1.Task_2;

public class MainForRunnable {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello from anonymous class!");

        r1.run();
    }
}
