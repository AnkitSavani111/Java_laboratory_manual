/*
    Design an interface named Colorable with a void method named howToColor().
    Every class of a colorable object must implement the Colorable interface. Design a
    class named Square that extends GeometricObject and implements Colorable.
    Implement howToColor to display the message Color all four sides. The Square
    class contains a data field side with getter and setter methods, and a constructor for
    constructing a Square with a specified side. The Square class has a private double
    data field named side with its getter and setter methods. It has a no-arg constructor to
    create a Square with side 0, and another constructor that creates a Square with the
    specified side
*/

// Ankit Savani (21CE122)

interface Colorable {
    /** Describe how to color */
    String howToColor();
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

class Square extends GeometricObject implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter();
    }
}

public class Pr_9 {
    /** Main method */
    public static void main(String[] args) {
        // Create an array of five GeometricObjects
        GeometricObject[] squares = { new Square(4.5), new Square(14),
                new Square(8.2), new Square(12), new Square(10) };

        // Display the area and invoke the howToColor
        // method for each GeometricObject
        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSquare #" + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            System.out.println("How to color: " + ((Square) squares[i]).howToColor());
        }
    }
}