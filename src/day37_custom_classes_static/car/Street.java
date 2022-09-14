package day37_custom_classes_static.car;

public class Street {
    public static void main(String[] args) {
        Car bmw = new Car("X5", "James", 896541357, 'C' );
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
        System.out.println(bmw.model); //this is accessing instance variable
    }
}
