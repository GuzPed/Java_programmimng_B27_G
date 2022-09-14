package day41_exceptions.try_catch;

public class ExampleOne {
    public static void main(String[] args) {

        String s = null;
     //   System.out.println(s.length()); //runtinme exception - NullPointerException

        s= "hello";
      //  System.out.println(s.charAt(10));// runtinme exception - StringIndexOutOfBoundException

        System.out.println("Hello");

        //Thread.sleep(5000);  // the method has some possible checked exception, so we need to handle it before we can compile - checked - compile time

    }
}
