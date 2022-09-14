package day40_oop_inheritance.shape;

public class Circle extends Shape{
    double radius;

public Circle(double radius){
    super("Circle");
    this.radius = radius;
}

@Override
    public double area(){
    return radius * radius+Math.PI;
    }
    //Math.row(radius, 2) * Math.PI


    @Override
    public double perimeter(){
    return 2*Math.PI * radius;
    }

    @Override
    public String toString(){
        return super.toString() + "\nRadius " + radius;
    }

}
