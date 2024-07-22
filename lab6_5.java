import java.lang.Math;

// Parent class
class lab6_5 {
    protected double x;
    protected double y;

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

// Child class inheriting from MyPoint
class ThreeDPoint extends MyPoint {
    private double z;

    // No-arg constructor
    public ThreeDPoint() {
        this(0, 0, 0);
    }

    // Constructor with specified coordinates
    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    // Getter method for z coordinate
    public double getZ() {
        return z;
    }

    // Override distance method to return distance in three-dimensional space
    @Override
    public double distance(MyPoint point) {
        if (point instanceof ThreeDPoint) {
            ThreeDPoint other = (ThreeDPoint) point;
            double xDiff = this.x - other.getX();
            double yDiff = this.y - other.getY();
            double zDiff = this.z - other.getZ();
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
        } else {
            return super.distance(point); // Calculate distance in two-dimensional space
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating two points
        ThreeDPoint point1 = new ThreeDPoint(); // (0, 0, 0)
        ThreeDPoint point2 = new ThreeDPoint(10, 30, 25.5);

        // Displaying distance between the two points
        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
    }
}
