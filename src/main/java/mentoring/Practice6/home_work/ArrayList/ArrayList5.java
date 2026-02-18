package mentoring.Practice6.home_work.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList5 {
    private ArrayList<Integer> arrayListFive = new ArrayList<>(Arrays.asList(2, 7, 4, 9, 1));

    public void findAndPrintMaxNumber() {
        int max = Collections.max(arrayListFive);
        System.out.println("ArrayList Task 5: " + max);
    }
}
