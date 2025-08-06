package Practice10_multithreads.HomeWork.Task_3;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ThreadForVolatile threadForVolatile = new ThreadForVolatile();

        Thread t1 = new Thread(threadForVolatile);
        t1.start();

        Thread.sleep(2000);
        threadForVolatile.stop();

    }
}
