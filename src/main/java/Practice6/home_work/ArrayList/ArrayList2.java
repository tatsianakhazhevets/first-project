package Practice6.home_work.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    private ArrayList<Integer> arrayListTwo = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7, 8, 10));

    public void printEvenElements() {
        System.out.println("ArrayList Task 2: ");
        arrayListTwo.forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });
    }
}
