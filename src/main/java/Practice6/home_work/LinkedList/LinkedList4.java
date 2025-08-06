package Practice6.home_work.LinkedList;

import java.util.LinkedList;

public class LinkedList4 {
    private LinkedList<Integer> linkedListFour;

    public LinkedList4() {
        this.linkedListFour = new LinkedList<>();
    }

    public void addInteger(Integer integer) {
        linkedListFour.offer(integer);
    }

    public int sumOfIntegers() {
        int sum = 0;
        for (Integer integer : linkedListFour) {
            sum = sum + integer;
        }
        return sum;
    }

    public void printLinkedListFour() {
        System.out.println("Сумма значений в likedListFour: " + sumOfIntegers());
    }
}
