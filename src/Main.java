public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(3,1);
        Point p3 = p1.add(p2);
        Point p4 = p1.subract(p2);

        System.out.println( "Point 1: " + p1 + ", Point 2: " + p2);
        System.out.println("Addition: " + p3);
        System.out.println("Substraction: " + p4);
    }
}