package day37_custom_classes_static.iphone;

public class Iphone {

    //instance variables
    String model;
    String color;
    double price;
    int storage;

    //static variables
    static String os;
    static String brand;

    //static block used to initialize static variables
    static{
        System.out.println("STATIC BLOCK RUN");
        os = "IOS";
        brand = "Apple";
    }



    //constructor used to initizlize instance variables
    public Iphone(String model, String color, double price, int storage) {
        System.out.println( "CONSTRUCTION RUN");
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;

    }

    /*
    Difference between static block & constructor

    static block will run once, the first time the class is used

    constructor will be called every time  an object is made
     */

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
