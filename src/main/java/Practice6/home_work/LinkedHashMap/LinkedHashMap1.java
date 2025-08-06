package Practice6.home_work.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    private LinkedHashMap<String, Integer> linkedHashMapOne;

    public LinkedHashMap1() {
        this.linkedHashMapOne = new LinkedHashMap<>();
    }

    public void addNameAndGrade(String name, Integer grade) {
        linkedHashMapOne.put(name, grade);
    }

    public void printLinkedHashMapOne() {
        for (Map.Entry<String, Integer> entry : linkedHashMapOne.entrySet()) {
            String name = entry.getKey();
            Integer grade = entry.getValue();
            System.out.println("Имя: " + name + ", оценка: " + grade);
        }
    }
}
