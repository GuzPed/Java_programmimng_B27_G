package day43_abstraction.shape;

public class Circle extends Shape{

    public final double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;

    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }


    @Override
    public String toString() {
        String or=  super.toString();
        return or.substring(0, or.indexOf("|")) + " | Radius: " + radius+or.substring(or.indexOf("|")-1);

    }
}
