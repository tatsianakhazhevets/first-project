package Practice10_multithreads.HomeWork.Task_3;

public class ThreadForVolatile implements Runnable {

    private int counter = 0;
    private volatile boolean flagStop = false;

    @Override
    public void run() {
        while (!flagStop) {
            System.out.println("Значение счетчика: " + counter);
            counter++;
        }
    }

    public void stop() {
        this.flagStop = true;
    }
}
