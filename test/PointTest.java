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
        System.out.println("--");
    }

    @Test
    void add() {
        Point pointThree = pointOne.add(pointTwo);

        assertEquals(12.0, pointThree.getX(), DELTA);
        assertEquals(12.0, pointThree.getY(), DELTA);

        System.out.println("add");
    }

    @Test
    void subtract() {
        Point pointThree = pointOne.subtract(pointTwo);

        assertEquals(8.0, pointThree.getX(), DELTA);
        assertEquals(8.0, pointThree.getY(), DELTA);

        System.out.println("sub");
    }

    @Test
    void multiply() {
        Point pointThree = pointOne.multiply(2.0);

        assertEquals(20.0, pointThree.getX(), DELTA);
        assertEquals(20.0, pointThree.getY(), DELTA);

        System.out.println("mult");
    }

    @Test
    void divide() {
        Point pointThree = pointOne.divide(2.0);

        assertEquals(5.0, pointThree.getX(), DELTA);
        assertEquals(5.0, pointThree.getY(), DELTA);

        System.out.println("div");
    }
}