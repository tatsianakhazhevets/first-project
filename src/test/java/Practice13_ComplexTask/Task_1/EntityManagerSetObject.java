package Practice13_ComplexTask.Task_1;

import mentoring.Practice13_ComplexTask.Task_1.EntityManager;
import mentoring.Practice13_ComplexTask.Task_1.User;
import org.junit.jupiter.api.BeforeEach;

public class EntityManagerSetObject {

    protected EntityManager<User> em;

    @BeforeEach
    public void setEm() {
        em = new EntityManager<>();
    }
}