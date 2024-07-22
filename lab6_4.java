import java.lang.Math;

class lab6_4{
    private double x;
    private double y;

    // No-arg constructor
    public MyPoint() {
        this(0, 0);
    }

    // Constructor with specified coordinates
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y coordinates
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to calculate distance between two points
    public double distance(MyPoint point) {
        double xDiff = this.x - point.getX();
        double yDiff = this.y - point.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate distance between this point and specified coordinates
    public double distance(double x, double y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating points
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        // Calculating distance between points
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));

        // Calculating distance from point1 to specified coordinates
        double x = 0;
        double y = 0;
        System.out.println("Distance between point1 and (" + x + ", " + y + "): " + point1.distance(x, y));
    }
}