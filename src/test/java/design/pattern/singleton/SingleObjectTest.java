package design.pattern.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingleObjectTest {

    @Test
    void singletonClassTest() {
        final SingleObject singleInstance = SingleObject.getInstance();
        assertEquals(singleInstance.getName(), "Singleton-Name");

    }
}