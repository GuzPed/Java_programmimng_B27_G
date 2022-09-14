package day43_abstraction.learning;

public interface Mac {

    public static final String brand = "Apple"; // the keywords are grey, because we do not need to type them, they are by default public static final
    String os = "IOS"; // public static final String os="IOS"
    // brand and os are both public static final
    // instance variable are not allowed in interface

    // methods: in interface you can define abstract methods (this are default), static and final

    void turnOn(); // public abstract void turnOn()

    public static void getBrand(){ // public is grey, because everything is public by default
        System.out.println("The brand is Apple");
    }

    public default void typing(){ // default sllows us to create a method with implementation in the interface. It is NOT the default access modifier. this is a instance method for the class that implements it
        System.out.println("the brand is Apple");
    }



}
