package mentoring.Practice6.meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTaskOne {
    public static void main(String[] args) {
        // ArrayList<Integer> arrayList = new ArrayList<>(); - пустой массив
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        arrayList.add(6);

        ArrayList<Integer> listEvenOnly = new ArrayList<>();

        // for (i = 0, ...)
        // forEach
        // while (iterator) - Iterator<Integer>.... below

        Iterator<Integer> iteratorForList = arrayList.iterator();

        // в любого итератора есть два основных метода hasNext и next

        while (iteratorForList.hasNext()) {
            Integer currentElement = iteratorForList.next();
            if (currentElement % 2 == 1) {
                listEvenOnly.add(currentElement);
            }
        }
        System.out.println(listEvenOnly);

    ArrayList<String> strings = new ArrayList<>(Arrays.asList("a", "aa", "aba"));

    System.out.println(findStringWithMaxLength(strings));
    System.out.println(findSumOfAllElements(arrayList));

    }

    public static String findStringWithMaxLength(ArrayList<String> strings) {
        Integer max = 0;
        String maxString = "";
        for (String str: strings) {
            if (str.length() > max) {
                max = str.length();
                maxString = str;
            }
        }
        return maxString;
    }

    public static int findSumOfAllElements(ArrayList<Integer> arrayList) {
        int sum = 0;

        for (Integer element: arrayList) {
            sum = sum + element;
        }
        return sum;
    }
}
