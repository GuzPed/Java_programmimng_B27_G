package day42_exceptions_abstraction.homework.shape;

public class Rectangle extends Shape {
    /*
    Create a concrete class Rectangle
    sub class of Sharpe
    create an instance variable length
    create an instance variable width
    call the parent constructor to set the name of the shape to "Rectangle" & initialize the length and width values for the shape
    implement the two abstract methods for a rectangle shape
        area()
        perimeter()
    override the toString to return the name, area, perimeter, length, and width
     */
    int length;
    int width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return length*2+width*2;
    }

    @Override
    public String toString() {
        return super.toString() + ", where length is " + length + " and width is " + width;
    }
}
