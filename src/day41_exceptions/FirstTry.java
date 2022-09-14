package day41_exceptions;

public class FirstTry {
    public static void main(String[] args) {

        try {
            String s = "hello world";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("the String was too short. It went out of Bounds");
        }

        System.out.println("Hello");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Invalid time given");
        }

        System.out.println("World");
    }
}
