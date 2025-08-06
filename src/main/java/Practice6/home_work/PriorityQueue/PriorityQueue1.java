package Practice6.home_work.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    private PriorityQueue<Integer> priorityQueueOne;

    public PriorityQueue1() {
        this.priorityQueueOne = new PriorityQueue<>();
    }

    public void addNumber (Integer number) {
        priorityQueueOne.offer(number);
    }

    public void printAndDeletePriorityQueueOne() {
        while (!priorityQueueOne.isEmpty()) {
            System.out.println(priorityQueueOne.poll());
        }
    }
}
