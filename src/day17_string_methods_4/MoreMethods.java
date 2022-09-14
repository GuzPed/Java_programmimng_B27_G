package day17_string_methods_4;

public class MoreMethods {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.isEmpty()); // false

        String s2 = " "; // has space character
        System.out.println(s2.isEmpty()); // false

        String s3 = ""; // empty space
        System.out.println(s2.isEmpty()); // true

        String a = "      ";  //spaces are characters
        System.out.println(a.isEmpty()); // ckecks if there is characters   //false
        System.out.println(a.isBlank()); // check for non space characters //true

        String b = "hdhd";
        System.out.println(b.isEmpty()); // false
        System.out.println(b.isBlank()); //false


    }


}
