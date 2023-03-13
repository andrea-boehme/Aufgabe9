import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void add() {
        Point testPoint1 = new Point(1.0, 1.0);
        Point testPoint2 = new Point(3.0, 1.0);
        Point testPoint3 = testPoint1.add(testPoint2);

        assertEquals(testPoint3.getX(), 4, 0.01);
        assertEquals(testPoint3.getY(), 2, 0.01);
    }

    @Test
    void sub() {
        Point testPoint1 = new Point(1.0, 1.0);
        Point testPoint2 = new Point(3.0, 1.0);
        Point testPoint3 = testPoint1.sub(testPoint2);

        assertEquals(testPoint3.getX(), -2, 0.01);
        assertEquals(testPoint3.getY(), 0, 0.01);
    }

    @Test
    void mult() {
        Point testPoint1 = new Point(1.0, 1.0);
        Point testPoint3 = testPoint1.mult(3.0);

        assertEquals(testPoint3.getX(), 3, 0.01);
        assertEquals(testPoint3.getY(), 3, 0.01);
    }

    @Test
    void div() {
        Point testPoint1 = new Point(10.0, 10.0);
        Point testPoint3 = testPoint1.div(2.0);

        assertEquals(testPoint3.getX(), 5.0, 0.01);
        assertEquals(testPoint3.getY(), 5.0, 0.01);
    }
}