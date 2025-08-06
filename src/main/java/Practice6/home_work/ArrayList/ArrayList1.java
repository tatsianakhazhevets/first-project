package Practice6.home_work.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    private ArrayList<Integer> arrayListOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public void addNewElement (Integer newElement) {
        arrayListOne.add(newElement);
    }

    public void printArrayListOne() {
        System.out.println("ArrayList1: ");
        arrayListOne.forEach(System.out::println);
    }
}
