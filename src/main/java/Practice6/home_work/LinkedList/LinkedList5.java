package Practice6.home_work.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList5 {
    private LinkedList<Integer> linkedListFive;

    public LinkedList5() {
        this.linkedListFive = new LinkedList<>();
    }

    public void addInteger (Integer integer) {
        linkedListFive.addLast(integer);
    }

    public void printLinkedListFive() {
        ListIterator<Integer> iterator = linkedListFive.listIterator();

        System.out.println("Идем вперед: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println();

        System.out.println("Идем назад: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + ", ");
        }

    }
}
