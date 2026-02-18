package mentoring.Practice6.home_work.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeque3 {
    private ArrayDeque<Integer> arrayDequeThree;

    public ArrayDeque3() {
        this.arrayDequeThree = new ArrayDeque<>();
    }

    public void addFirstInArrayDequeThree(Integer number) {
        arrayDequeThree.addFirst(number);
    }

    public void addLastInArrayDequeThree(Integer number) {
        arrayDequeThree.addLast(number);
    }

    public void removeFirstInArrayDequeThree() {
        Integer number = arrayDequeThree.removeFirst();
        System.out.println(number);
    }

    public void removeLastInArrayDequeThree() {
        Integer number = arrayDequeThree.removeLast();
        System.out.println(number);
    }

    public void printArrayDequeThree() {
        for (Integer number : arrayDequeThree) {
        System.out.print(number + ", ");
        }
    }

}
