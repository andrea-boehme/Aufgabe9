public class Main {

    /**
     * main method creates two points with given parameters,
     * calls add and subtract calculation methods (calculates third point with first and second point),
     * prints out the result
     * @param args
     */
    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(3,1);
        Point p3 = p1.add(p2);
        Point p4 = p1.subtract(p2);

        System.out.println( "Point 1: " + p1 + ", Point 2: " + p2);
        System.out.println("Addition: " + p3);
        System.out.println("Subtraction: " + p4);
    }
}