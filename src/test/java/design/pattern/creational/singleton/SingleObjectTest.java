package design.pattern.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingleObjectTest {

    @Test
    void singletonClassTest() {
        final SingleObject singleInstance = SingleObject.getInstance();
        assertEquals(singleInstance.getName(), "Singleton-Name");

    }
    @Test
    void singletonClassInstanceTest() {
        final SingleObject singleInstance = SingleObject.getInstance();
        final SingleObject singleInstanceSecond = SingleObject.getInstance();
        assertSame(singleInstance,singleInstanceSecond);
    }

}