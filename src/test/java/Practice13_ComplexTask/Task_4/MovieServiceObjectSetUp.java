package Practice13_ComplexTask.Task_4;

import mentoring.Practice13_ComplexTask.Task_4.MovieService;
import org.junit.jupiter.api.BeforeEach;

public class MovieServiceObjectSetUp {

    protected MovieService movieService;

    @BeforeEach
    public void setUp() {
        movieService = new MovieService();
    }
}