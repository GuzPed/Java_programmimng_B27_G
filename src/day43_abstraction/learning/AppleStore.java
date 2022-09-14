package day43_abstraction.learning;

public class AppleStore {
    public static void main(String[] args) {
        //everything I can access without any class, directly from the interface - I was able to access these because they were static

        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();

        //use a class the implements the interface
        Desktop obj = new Desktop();

        obj.turnOn();
        obj.typing();
     //   obj.getBrand();  // cannot access the statuc member from the classes that implement that interface
        //only access static member of an interface by the interface
    }
}
