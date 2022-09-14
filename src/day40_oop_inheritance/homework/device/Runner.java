package day40_oop_inheritance.homework.device;

public class Runner {
    public static void main(String[] args) {
        /*
        Create a class UseDevice

	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes

         */

        Tv tv1 = new Tv("Samsung", "dsfsdf", 1100, true);
        System.out.println(tv1);
        System.out.println(tv1.useDevice());

        Phone phone1 = new Phone("Apple", "XP", 1300, true);
        System.out.println(phone1);
        System.out.println(phone1.useDevice());



    }
}
