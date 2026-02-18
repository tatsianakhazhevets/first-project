package mentoring.Practice10_multithreads.HomeWork.Task_4;

public class Counter {

    private int count = 0;

    public synchronized void increment() {
        this.count++;
    }

    public int getCouner(){
        return count;
    }
}
