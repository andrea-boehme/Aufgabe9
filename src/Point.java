public class Point {
    // define attributes (two dimensions)
    private double x;
    private double y;

    // create constructor method to define a point object at a specific x,y location:
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*
    public void setX(double x) {
        this.x = x;
    }
    */

    // create getter method for x
    public double getX() {
        return x;
    };

    // create getter method for y
    public double getY() {
        return y;
    };

    public Point add(Point p) {
        double x_result = x + p.getX();
        double y_result = y + p.getY();

        return new Point(x_result, y_result);
    }

    public Point subract(Point p) {
        double x_result = x - p.getX();
        double y_result = y - p.getY();

        return new Point(x_result, y_result);
    }

    public Point multiply(double p) {
        double x_result = x * p;
        double y_result = y * p;

        return new Point(x_result, y_result);
    }

    public Point divide(double p) {
        double x_result = x / p;
        double y_result = y / p;

        return new Point(x_result, y_result);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
