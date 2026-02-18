package mentoring.Practice6.home_work.LinkedList;

import java.util.LinkedList;

public class LinkedList3 {
    private LinkedList<String> linkedListThree;

    public LinkedList3() {
        this.linkedListThree = new LinkedList<>();
    }

    public void addString(String string) {
        linkedListThree.offer(string);
    }

    public void printLinkedListThree() {
        if (!linkedListThree.isEmpty()) {
            System.out.println("Первый элемент: " + linkedListThree.getFirst());
            System.out.println("Второй элемент: " + linkedListThree.getLast());
        }
    }
}
