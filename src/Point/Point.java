package Point;

public class Point {
    int X;
    int Y;

    public void setX(int x) {
        X = x;
    }

    public int getX() {
        return X;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getY() {
        return Y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
    }
    public double distancoToAnotherPoint(Point point) {
        return Math.sqrt(Math.pow((X - point.getX()),2) + Math.pow((Y - point.getY()),2));
    }

    public Point clone() {
        return this;
    }

    public void move(int x, int y) {
        X += x;
        Y += y;
    }
}
