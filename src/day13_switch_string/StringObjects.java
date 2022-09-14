package day13_switch_string;

public class StringObjects {
    public static void main(String[] args) {
        String s = "first"; // string literal in string pool
        String s2 = new String ("second"); // in the heap
        System.out.println(s==s2); // compares 2 different Objects = False

        String s3 = new String ("first");
        System.out.println(s3 == s); // false = compares 2 objects in different locations

        String s4 = "second";
        System.out.println(s==s4); // False different objects in the string pool

        String s5 = "first";
        System.out.println(s==s5); // true - same Object in the string pool, same address



    }

}
