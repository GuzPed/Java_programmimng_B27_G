package day16_string_methods_3;

public class SubstringExamples {
    public static void main(String[] args) {
        String s = "infinity";
                //  01234567
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
        System.out.println(s.substring(7));
       // System.out.println(s.substring(10)); is not valid and stops the program

        System.out.println(s.substring(1,6));
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(3,8));
        //System.out.println(s.substring(0,9)); //  8 is not valid and stops the program



    }

}
