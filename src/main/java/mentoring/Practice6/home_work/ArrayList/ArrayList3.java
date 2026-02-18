package mentoring.Practice6.home_work.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
    private ArrayList<String> arrayListThree = new ArrayList<>(Arrays.asList("q", "qa", "qaz", "w", "qazw"));

    String longest = "";

    public String findTheLongestString() {
        arrayListThree.forEach(string -> {
            if (string.length() > longest.length()) {
                longest = string;
            }
        });
        return longest;
    }

    public void printArrayListThree() {
        System.out.println("ArrayList Task 3: " + longest);
    }

}
