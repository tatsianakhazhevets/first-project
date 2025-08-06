package Practice6.home_work.LinkedList;

import java.util.LinkedList;

public class LinkedList2 {
    private LinkedList<String> linkedListTwo;

    public LinkedList2() {
        this.linkedListTwo = new LinkedList<>();
    }

    public void addTask(String task) {
        linkedListTwo.addLast(task);
    }

    public void printLinkedListTwo() {
        while (!linkedListTwo.isEmpty()) {
            String task = linkedListTwo.removeFirst();
            System.out.println("Задача: " + task);
        }
    }
}
