import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private static final double DELTA= 0.001;

    private Point pointOne;
    private Point pointTwo;

    @BeforeEach
    public void initPoints() {
        pointOne = new Point(10.0, 10.0);
        pointTwo = new Point(2.0, 2.0);
    }

    @Test
    void add() {
        Point pointThree = pointOne.add(pointTwo);

        assertEquals(pointThree.getX(), 12.0, DELTA);
        assertEquals(pointThree.getY(), 12.0, DELTA);
    }

    @Test
    void substract() {
        Point pointThree = pointOne.subract(pointTwo);

        assertEquals(pointThree.getX(), 8.0, DELTA);
        assertEquals(pointThree.getY(), 8.0, DELTA);
    }

    @Test
    void multiply() {
        Point pointThree = pointOne.multiply(2.0);

        assertEquals(pointThree.getX(), 20.0, DELTA);
        assertEquals(pointThree.getY(), 20.0, DELTA);
    }

    @Test
    void divide() {
        Point pointThree = pointOne.divide(2.0);

        assertEquals(pointThree.getX(), 5.0, DELTA);
        assertEquals(pointThree.getY(), 5.0, DELTA);
    }
}