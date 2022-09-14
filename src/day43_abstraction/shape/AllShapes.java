package day43_abstraction.shape;

public class AllShapes {
    public static void main(String[] args) {

        Circle obj = new Circle(4.6);

        System.out.println(obj);
        System.out.println(obj.name);
        System.out.println(obj.radius);
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}
