package homework_practice;

public class HelloWorld {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        a=a+b;
        b = a.substring(0,a.length()-b.length());
        a= a.substring(a.length()-b.length());

        System.out.println(a + " " +b);


    }
}
