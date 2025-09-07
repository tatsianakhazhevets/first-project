package Practice13_ComplexTask.Task_1;

import org.junit.jupiter.api.BeforeEach;

public class EntityManagerSetObject {

    protected EntityManager<User> em;

    @BeforeEach
    public void setEm() {
        em = new EntityManager<>();
    }
}