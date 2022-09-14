package my_utils;

import day38_oop_encapsulation.AccessModifiers;

public class TestingAccessOutside {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a); // public. access within PROJECT
   //     System.out.println(obj.b);  // default. access within same package
   //     System.out.println(obj.c); // private,  access only within same class!!
    }
}
