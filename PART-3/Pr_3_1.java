/*  Create an abstract c lass GeometricObject as the superclass for Circle and
    Rectangle. GeometricObject models common features of geometric objects. Both
    Circle and Rectangle contain the getArea() and getPerimeter() methods for
    computing the area and perimeter of a circle and a rectangle. Since you can
    compute areas and perimeters for all geometric objects, so define the getArea() and
    getPerimeter() methods in the GeometricObject class. Give implementation in the
    specific type of geometric object. Create TestGeometricObject class to display area
    and perimeter of Rectangle and Triangle, compare area of both and display results.
    Design of all classes are given in the following UML diagram.  */

// Ankit Savani (21CE122)

import java.util.*;

// Program by Ankit Savani(21CE122)

abstract class GeometricObject {
    private String Color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {

    }

    protected GeometricObject(String Color, boolean filled) {
        this.Color = Color;
        this.filled = filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {

        return "The Color of the object is " + Color + "Object is filled ? " + filled;
    }

    abstract double getArea();

    abstract double getPerimeter();
}

class Circle extends GeometricObject {
    private double radius;
    double perimeter;
    double area;
    double Diameter;

    Circle() {
    }

    Circle(double radius, String Color, boolean filled) {
        super(Color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return (2 * Diameter);
    }

    double getArea() {
        area = (3.14 * Math.pow(radius, 2));
        return area;
    }

    double getPerimeter() {
        perimeter = (2 * 3.14 * radius);
        return perimeter;
    }
}

class Rectangle extends GeometricObject {
    private double height, width;
    double perimeter, area;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getArea() {
        area = height * width;
        return area;
    }

    double getPerimeter() {
        perimeter = 2 * (height + width);
        return perimeter;
    }
}

class TestGeometricObject {

}

public class Pr_3_1 {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        // Call parameterised constructor of the Circle class
        Circle objcircle = new Circle(5, "Blue", true);

        // Call parameterised constructor of the Rectangle class
        Rectangle objRectangle = new Rectangle(10, 20, "White", false);

        // Print data of Circle
        objcircle.toString();
        System.out.println("The parimeter of the Circle is " + objcircle.getPerimeter());
        System.out.println("The area of the Circle is " + objcircle.getArea());

        // Print Rectangle of Rectangle
        objRectangle.toString();
        System.out.println("The area of the Rectangle is " + objRectangle.getArea());
        System.out.println("The perimeter of the Rectangle is " + objRectangle.getPerimeter());

        objScanner.close();

    }

}