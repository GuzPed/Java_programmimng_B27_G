package day38_oop_encapsulation.square;

public class SqiuareObjects {
    public static void main(String[] args) {
        Square num1 = new Square(5);
        System.out.println(num1);

        System.out.println(num1.calculateArea());

        Square num2 = new Square(-1);
        System.out.println(num2);

    }


}
