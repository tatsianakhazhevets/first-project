package mentoring.Practice6.home_work.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {
    private ArrayList<Integer> arrayListFour = new ArrayList<>(Arrays.asList(1, 2, 4, 7, 10));

    int sum = 0;

    public int sumOfAllElements() {
        arrayListFour.forEach(number -> {
            sum = sum + number;
        });
        return sum;
    }

    public void printArrayListFour() {
        System.out.println("ArrayList Task 4: " + sum);
    }
}
