package exercise8;

public class Point {
    // Define attributes
    public double x;
    public double y;
    public Point() {
        // Initialize attributes to 0
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        // Change attributes through console
        System.out.println("x:");
        this.x = Utils.INPUT.nextDouble();

        System.out.println("y:");
        this.y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        this.x += xDelta;
        this.y += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        return new Point(this.x + xDelta, this.y + yDelta);
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        if (Utils.equals(this.x, otherPoint.x) && Utils.equals(this.y, otherPoint.y)) {
            return true;
        }
        return false;
    }

    public String toString() {
        // Represent attributes as string
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }
}
