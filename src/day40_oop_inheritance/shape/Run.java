package day40_oop_inheritance.shape;



public class Run {
    public static void main(String[] args) {

        Circle circle = new Circle(3.4);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println("++++++++++++++++++++++++");

        Square square = new Square(5.5);
        System.out.println(square);




    }
}
