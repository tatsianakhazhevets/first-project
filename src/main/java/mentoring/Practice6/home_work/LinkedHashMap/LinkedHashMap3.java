package mentoring.Practice6.home_work.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap3 {
    private LinkedHashMap<String, String> linkedHashMapThee;

    public LinkedHashMap3() {
        this.linkedHashMapThee = new LinkedHashMap<>();
    }

    public void addPage(String id, String name) {
        if (linkedHashMapThee.size() >= 10) {
            for (String key : linkedHashMapThee.keySet()) {
                linkedHashMapThee.remove(key);
                break;
            }
        }
        linkedHashMapThee.put(id, name);
    }

    public void printLinkedHashMapThree() {
        System.out.println(linkedHashMapThee.entrySet());
    }
}
