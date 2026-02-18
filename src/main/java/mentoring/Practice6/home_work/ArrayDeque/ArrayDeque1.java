package mentoring.Practice6.home_work.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    private ArrayDeque<String> arrayDequeOne;

    public ArrayDeque1() {
        this.arrayDequeOne = new ArrayDeque<>();
    }

    public void addColor(String color) {
        arrayDequeOne.addLast(color);
    }

    public void printArrayDequeOne1() {
        System.out.println(arrayDequeOne);
    }

    public void printArrayDequeOne2() {
        for (String color : arrayDequeOne) {
            System.out.println(color);
        }
    }
}
