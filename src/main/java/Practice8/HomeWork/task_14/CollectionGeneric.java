package Practice8.HomeWork.task_14;

import java.util.HashMap;
import java.util.Map;

public class CollectionGeneric<K, V> {

    private Map<K, V> map;

    public CollectionGeneric() {
        this.map = new HashMap<>();
    }

    public void addAndPrintMap(K key, V value){
        map.put(key, value);
        System.out.println(map);
    }
}
