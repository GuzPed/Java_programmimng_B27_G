package day42_exceptions_abstraction.homework.shape;

public class Circle extends Shape {
    /*
    Create a concrete class Circle
    sub class of Sharpe
    create an instance variable radius
    call the parent constructor to set the name of the shape to "Circle" & initialize the radius value for the circle
    implement the two abstract methods for a circle shape
        area()
        perimeter()
    override the toString to return the name, area, perimeter, and radius
     */
    int radius;

    public Circle( int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return radius*radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", where radius is" + radius;
    }
}
