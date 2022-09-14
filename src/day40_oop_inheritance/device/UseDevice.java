package day40_oop_inheritance.device;

public class UseDevice {
    /*
    Create a class UseDevice
	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class
	List the is a relations of all the classes
     */
    public static void main(String[] args) {

        Tv tv1 = new Tv("Samsung", 1000, true);
        System.out.println(tv1.useDevice());
        System.out.println(tv1);

        System.out.println("=================================");

        Phone phone1 = new Phone("Iphone", "XPmax", 1200, true);
        System.out.println(phone1.useDevice());
        System.out.println(phone1);

    }

}
