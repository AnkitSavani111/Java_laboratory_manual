/*
    Define a class named ComparableSquare that extends Square and implements
    Comparable. Implement the compareTo method to compare the Squares on the basis
    of area. Write a test class to find the larger of two instances of
    ComparableSquareobjects.
*/

// Ankit Savani (21CE122)

class Square extends GeometricObject {
    private double radius;

    public Square() {
    }

    public Square(double radius) {
        this.radius = radius;
    }

    public Square(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override /** Implement the toString method in GeometricObject */
    public String toString() {
        return super.toString() + "\nDate created: " + getDateCreated() +
                "\nRadius: " + radius;
    }
}

class ComparableSquare extends Square implements Comparable<ComparableSquare> {

    public ComparableSquare() {
    }

    /** Construct a CoparableSquare with specified radius */
    public ComparableSquare(double radius) {
        super(radius);
    }

    /** Construct a CoparableSquare with specified properties */
    public ComparableSquare(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(ComparableSquare o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override // Implement the toString method defined in Square
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }
}

abstract class GeometricObject {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean,
     * the get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

public class Pr_10 {
    /** Main method */
    public static void main(String[] args) {
        // Create two instances of ComparableSquare objects
        ComparableSquare comparableSquare1 = new ComparableSquare(12.5);
        ComparableSquare comparableSquare2 = new ComparableSquare(18.3);

        // Display comparableSquares
        System.out.println("\nComparableSquare1:");
        System.out.println(comparableSquare1);
        System.out.println("\nComparableSquare2:");
        System.out.println(comparableSquare2);

        // Find and display the larger of the two ComparableSquare objects
        System.out.println(
                (comparableSquare1.compareTo(comparableSquare2) == 1 ? "\nComparableSquare1 " : "\nComparableSquare2 ")
                        + "is the larger of the two Squares");
    }
}