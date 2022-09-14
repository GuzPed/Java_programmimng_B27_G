package day41_exceptions.hiding;

public class First {

    public static void staticMethod(){
        System.out.println("this is static method from First");
    }

    public void instanceMethodA(){
        staticMethod();
    }


}
