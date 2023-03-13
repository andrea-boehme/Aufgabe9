public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(3,1);
        Point p3 = p1.add(p2);
        Point p4 = p1.sub(p2);
        Point p5 = p1.mult(p2);
        Point p6 = p1.div(p2);

        System.out.println( "Point 1: " + p1 + ", Point 2: " + p2);
        System.out.println("Addition: " + p3);
        System.out.println("Substraction: " + p4);
        System.out.println("Multiplication: " + p5);
        System.out.println("Division: " + p6);

    }
}