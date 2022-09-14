package day42_exceptions_abstraction.homework.shape;

public class Run {
    public static void main(String[] args) {

        System.out.println(new Circle(20).area());
        System.out.println(new Circle(20).perimeter());

        Rectangle rec = new Rectangle(5,8);
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        System.out.println(rec);


    }



}
