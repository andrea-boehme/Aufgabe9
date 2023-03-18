public class Point {
    // define attributes (two dimensions)
    private double x;
    private double y;

    /**
     * constructor method to define a point object at a specific x,y location (instead of setter method)
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getter method to get value of x
     * @return value of x
     */
    public double getX() {
        return x;
    };

    /**
     * getter method to get value of y
     * @return value of y
     */
    public double getY() {
        return y;
    };

    /**
     * method that calculates (add) the x,y coordinates and returns a new result point
     * the new x,y are defined as sum of the initial points (p1) coordination and
     * of the p-Point (p2) given as parameter in main method (p1.add(p2)).
     * @param p  point that should be added to the initial point (p2)
     * @return  new point that represents the sum of the two points.
     */
    public Point add(Point p) {
        double x_result = x + p.getX(); // x: x von p1; p.getX(): x von p2
        double y_result = y + p.getY();

        return new Point(x_result, y_result);
    }

    public Point subtract(Point p) {
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

    /**
     * toString method converts a string object into a string
     * @return: string representation of an object
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

// The method that is used to set/modify the value of a private instance variable of a class is known as a setter method and,
// the method that is used to retrieve the value of a private instance variable is known as a getter method.
// Encapsulating this class by making the variables private (e.g. x and y) and providing setter and getter methods.
// If you want to access these variables you cannot access them directly,
// you can just use the provided setter and getter methods to read and write their values.
// The variables which you haven’t provided these methods will be completely hidden from the outside classes.

// By making the variable a private data member, you can more easily ensure that the value is never negative.
// On the other hand, if the variable is public, another class could change it to a negative value which can cause other parts
// of the code to crash.

/* here no need for setter method as already in the constructor
    public void setX(double x) {
        this.x = x;
    }
    */