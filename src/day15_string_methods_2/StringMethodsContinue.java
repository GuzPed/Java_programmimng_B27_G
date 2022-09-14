package day15_string_methods_2;

public class StringMethodsContinue {
    public static void main(String[] args) {
        String a = "today it is 80 degrees";
        System.out.println(a.contains("today")); //true
        System.out.println(a.contains("is")); // true
        System.out.println(a.contains("8")); //true
        System.out.println(a.contains("$")); //false
        System.out.println(a.contains("it is 80")); //true
        System.out.println(a.contains("80") && a.contains("today")); // true

        System.out.println("----------------------------------");
        String s = "java;";
                   //01235

        System.out.println(s.charAt(0)); //j
        System.out.println(s.charAt(1));//a
        System.out.println(s.charAt(2));//v
        System.out.println(s.charAt(3));//a
        System.out.println(s.charAt(4));//:
       // System.out.println(s.charAt(5));// nothing here. will give an error

        System.out.println(s.length());

        // reverse my String hardcoded - to get : avaj
        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println("----------------------------------");

        System.out.println(""+ s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0));












    }
}
