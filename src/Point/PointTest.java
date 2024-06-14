package Point;

public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();
        point1.setX(3);
        point1.setY(4);
        point2.setX(-8);
        point2.setY(-6);
        System.out.println(point1.distanceToOrigin());
        System.out.println(point2.distanceToOrigin());
        System.out.println(point1.distancoToAnotherPoint(point2));
        System.out.println(point2.distancoToAnotherPoint(point1));

        Point point3 = point1.clone();
        System.out.println(point3.getX() + " " + point3.getY());

        point1.move(3,-4);
        System.out.println(point1.distanceToOrigin());
    }
}
