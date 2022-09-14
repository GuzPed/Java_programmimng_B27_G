package day13_switch_string;

public class StringEquals {
    public static void main(String[] args) {

        String s = "java";
        String s2 = "java";
        // both are literal Strings, so they are both in the pool
        System.out.println("s==s2 " + (s==s2)); // checks if they are same object, the same location, BUT it does not check the value

        System.out.println("s.equals(s2) " + s.equals(s2));// checks if the value of the String is the same

        String s3 = new String ("java"); // in the heap as a new Object
        System.out.println("s==s3 " + (s==s3)); // 2 different Objects -> false

        System.out.println("s.equals(s3) "+s.equals(s3)); // checks if the value of the stings are the same

        System.out.println(s.equals("Java")); // false java != Java




    }


}
