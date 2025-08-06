package Practice6.home_work.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1_2 {
    private TreeMap<String, Integer> treeMapOne;

    public TreeMap1_2() {
        this.treeMapOne = new TreeMap<>();
    }
     public void addNameWithGrade(String name, Integer grade) {
        treeMapOne.put(name, grade);
     }

     public void printTreeMapOne() {
        for (Map.Entry<String, Integer> entry : treeMapOne.entrySet()) {
            String name = entry.getKey();
            Integer grade = entry.getValue();
            System.out.println("Имя: " + name + ", балл: " + grade);
        }
     }

     public void minAndMapKey() {
        System.out.println("Минимальный ключ: " + treeMapOne.firstKey());
        System.out.println("Максимальный ключ: " + treeMapOne.lastKey());
    }


}
