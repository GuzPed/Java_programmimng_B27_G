package day43_abstraction.shape;

public abstract class Shape {
    public final String name;

    public Shape(String name){
        this.name=name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return  "name= " + name + " | Area: " + area() + "| Perimeter:  " + perimeter();
    }
}
