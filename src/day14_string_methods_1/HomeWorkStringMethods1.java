package day14_string_methods_1;

public class HomeWorkStringMethods1 {
    public static void main(String[] args) {
        /*
        Declare and assign a String
print the String in all uppercase format and
print the String in all lowercase format
         */
        String a = "I love you, mama";
        String b = " I LOVE you, PAPA";
        System.out.println(b.toLowerCase()); // will print lower case - i love you, papa
        System.out.println(a.toUpperCase()); // will print - I LOVE YOU, MAMA
        System.out.println(a); //will print the original sentence
        System.out.println(b);//will print the original sentence

        String c = a.toUpperCase(); // create a new string valuable, new object
        b = b.toLowerCase(); // reassign the new object to same value. it creates new object. the link to previous is lost
        System.out.println(c);
        System.out.println(b);


    }
}
