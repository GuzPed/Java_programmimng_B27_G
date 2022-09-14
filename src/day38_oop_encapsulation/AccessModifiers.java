package day38_oop_encapsulation;

public class AccessModifiers {

    public int a=5; // within project
    int b = 10; // this has default access because I did not use any other modifier. within package
    private int c = 20; // within class

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }






}
