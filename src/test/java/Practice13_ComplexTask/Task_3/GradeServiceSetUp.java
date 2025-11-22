package Practice13_ComplexTask.Task_3;

import org.junit.jupiter.api.BeforeEach;

public class GradeServiceSetUp {

    protected GradeService<Integer> gradeService;

    @BeforeEach
    public void gradeServiceSetUp() {
        gradeService = new GradeService<>();
    }
}
