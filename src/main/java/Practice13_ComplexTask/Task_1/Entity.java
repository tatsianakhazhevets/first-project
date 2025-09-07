package Practice13_ComplexTask.Task_1;

import java.util.Objects;

public class Entity {

    private final int age;
    private final String name;
    private final boolean isActive;

    public Entity(int age, String name, boolean isActive) {
        if(age < 0 || age > 110) {
            throw new IllegalArgumentException();
        }
        this.age = age;
        this.name = Objects.requireNonNull(name).trim();
        if(this.name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.isActive = isActive;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return age == entity.age && isActive == entity.isActive && Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, isActive);
    }
}