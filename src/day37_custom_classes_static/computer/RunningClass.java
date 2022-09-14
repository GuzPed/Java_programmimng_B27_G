package day37_custom_classes_static.computer;

public class RunningClass {
    public static void main(String[] args) {
        Computer nnn = new Computer(1000,"Apple", "yellow" );
        nnn.brand = "Apple";
        nnn.price = 1000;
        nnn.color = "red";

        System.out.println(Computer.hasScreen);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasMemory);

        System.out.println(nnn);

        Computer ddd = new Computer(1500, "Microsoft", "Blue" );
        System.out.println(ddd.price);
        System.out.println(ddd.brand);
        System.out.println(ddd.color);
        System.out.println(ddd);




    }
}
