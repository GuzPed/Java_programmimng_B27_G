package day37_custom_classes_static.iphone;

public class AppleStore {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone X", "Black", 1000, 256);
        System.out.println(iphone1);

        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);

// we could use the object to access to static variables, but better to use the class name

       Iphone iphone2 = new Iphone("Iphone 7", "Silver", 1000, 256);
        System.out.println(iphone2);


    }


}
