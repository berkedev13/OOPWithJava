package Point;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this(0,0);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double distancoToAnotherPoint(Point point) {
        return Math.sqrt(Math.pow((x - point.getX()),2) + Math.pow((y - point.getY()),2));
    }

    public Point clone() {
        return this;
    }


    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
