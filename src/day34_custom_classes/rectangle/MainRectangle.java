package day34_custom_classes.rectangle;

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 15.5;
        rectangle1.height = 5.0;

        System.out.println(rectangle1);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1);





    }
}
