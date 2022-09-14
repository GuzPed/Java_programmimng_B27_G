package day30_methods_practice_wrapper;

public class NullIdea {
    public static void main(String[] args) {
    String[] a ={"Hello", "World", "friday"};

        System.out.println(a[0]);
        System.out.println(a[0].charAt(0));

        String[] b = new String[2]; //[null, null]
        System.out.println(b[0]);//null
        System.out.println(b[0].charAt(0));//null.charAt(0) - error
}}
