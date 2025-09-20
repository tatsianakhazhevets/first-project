package Practice13_ComplexTask.Task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {

    private final CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void add(T entity) {
        if (entity == null) {
            throw new NullPointerException("Input cannot be null");
        }
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int minAge, int maxAge) {
        return entities.stream()
                .filter(entity -> minAge <= entity.getAge() && entity.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(entity -> entity.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<T> filterByActivity(boolean isActive) {
        return entities.stream()
                .filter(entity -> entity.isActive() == isActive)
                .collect(Collectors.toList());
    }
}