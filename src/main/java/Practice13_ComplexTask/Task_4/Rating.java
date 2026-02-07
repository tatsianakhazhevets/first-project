package Practice13_ComplexTask.Task_4;

import java.util.Objects;

public class Rating <T extends Number> {
    private final T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rating<?> rating1 = (Rating<?>) o;
        return Objects.equals(rating, rating1.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rating);
    }
}