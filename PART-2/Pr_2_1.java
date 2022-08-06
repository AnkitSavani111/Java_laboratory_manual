/*  Problem: 

    Design a class named Circle containing following attributes and behavior.
    • One double data field named radius. The default value is 1.
    • A no-argument constructor that creates a default circle.
    • A Single argument constructor that creates a Circle with the specified radius.
    • A method named getArea() that returns area of the Circle.
    • A method named getPerimeter() that returns perimeter of it.
*/

// Ankit Savani (21CE122)

public class Pr_2_1 {
    public static void main(String arguments[]) {
        // Calling Default constructor
        Circle objCircleDefault = new Circle();
        System.out.println("The area of the circle is " + objCircleDefault.getarea());
        System.out.println("The perimeter of the circle is " + objCircleDefault.getarea());

        // Calling parameterised constructor
        Circle objCirclePara = new Circle(10);
        System.out.println("The area of the circle is " + objCirclePara.getarea());
        System.out.println("The perimeter of the circle is " + objCirclePara.getarea());
    }
}

class Circle {
    private double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getperimeter() {
        return 2 * Math.PI * radius;
    }

    public double getarea() {
        return radius * radius * Math.PI;
    }
}
