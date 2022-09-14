package day40_oop_inheritance;

public class Parent {
    public static void hello(){
        System.out.println("Hello from Parent");
    }
}


class Child extends Parent{
public static void hello(){ // when i make this method, I am hidding the one from the parent
   // @Override  = static variables cannot override
    System.out.println("Hello from Child");
}
}

class Run{
    public static void main(String[] args) {
        Parent.hello();
        Child.hello();

    }
}