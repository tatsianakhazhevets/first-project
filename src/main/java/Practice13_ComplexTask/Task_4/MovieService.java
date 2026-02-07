package Practice13_ComplexTask.Task_4;

import java.util.*;

public class MovieService {

    private final Map<Movie, List<Rating<? extends Number>>> movieRaring = new HashMap<>();

    public Map<Movie, List<Rating<? extends Number>>> getMovieRaring() {
        return movieRaring;
    }

    public synchronized void addMovieRating(Movie movie, int rating) {

        int minRating = 1;
        int maxRating = 10;

        if (rating < minRating || rating > maxRating) {
            throw new IllegalArgumentException("Rating must be between " + minRating + " and " + maxRating);
        }

        if (!movieRaring.containsKey(movie)) {
            movieRaring.put(movie, new ArrayList<>());
        }

        movieRaring.get(movie).add(new Rating<>(rating));
    }

    public synchronized double countAverageRatingForMovie(Movie movie) {
        List<Rating<? extends Number>> ratings = movieRaring.get(movie);

        if (ratings == null) {
            return 0.0;
        }

        double average = ratings.stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(0.0);

        return Math.round(average * 10.0) / 10.0;
    }

    public synchronized List<Movie> sortMoviesByRating() {
        return movieRaring.keySet().stream()
                .sorted(Comparator.comparingDouble(this::countAverageRatingForMovie)
                        .reversed())
                .toList();
    }
}