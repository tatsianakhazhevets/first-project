package mentoring.Practice6.home_work.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeque2 {
    private ArrayDeque<Integer> arrayDequeTwo;

    public ArrayDeque2() {
        this.arrayDequeTwo = new ArrayDeque<>();
    }

    public void addNumbersInStack(Integer numbers) {
        arrayDequeTwo.push(numbers);
    }

    public void printArrayDequeTwo() {
        while (!arrayDequeTwo.isEmpty()) {
            System.out.println(arrayDequeTwo.pop());
        }
    }
}
