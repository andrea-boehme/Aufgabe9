public class PointUtils {

    public static final String NEW_POINT = "This is the new point";

    public static Point addPoints(Point p1, Point p2) {
        double x_result = p1.getX() + p2.getX();
        double y_result = p1.getY() + p2.getY();

        return new Point(x_result, y_result);
    }
}
