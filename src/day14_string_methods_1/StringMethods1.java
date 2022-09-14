package day14_string_methods_1;

public class StringMethods1 {
    public static void main(String[] args) {
        String item = "pen"; // in string pool
        String item2 = new String ("pen"); // directly in heap

        System.out.println(item==item2); // checks if the object is the same address object as item2

        String item3 = new String ("pen");
        System.out.println(item2 == item3); // compares 2 objects not the values. they both in a heap and have 2 different objects = adresses

        System.out.println(item.equals(item2)); // compares the value of the Strings, which checks if the characters are the same
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));
        System.out.println(item3.equals("Pen")); // false. because it is upper case. different object

        System.out.println(item.equalsIgnoreCase("Pen")); // check only for matching characters and ignores all the cases

        System.out.println("____________________________________");
        String username = "jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));
        System.out.println(password.equals("bond007"));
        System.out.println("____________________________________");

        String day = "Tuesday";
        System.out.println(day.length()); // counts how many characters are in the String value. output --> Int
        String day2 = "Friday";
        int lenght = day2.length(); //  lengh() method gives us back int type, so we can use it however we want
        System.out.println(lenght);

        String str = " jello "; // spaces are also characters, so they will be included as well
        System.out.println(str.length());

        System.out.println("____________________________________");

        String word = "Summer";
        word.toUpperCase(); // does not do anything with this value
        System.out.println(word); // will print Summer without changes , because it is immutable
        word=word.toUpperCase(); // reassign. this time is also everything is UPPERCASE. output --> String
        System.out.println(word);

        System.out.println("____________________________________");

        String sentence = "heLLo My Name is GuZel";
        System.out.println(sentence.toLowerCase()); // make a String that was lowercase and then print it - 1 time. DOES NOT change the value
        System.out.println(sentence); // will print the orogonal version, because String is immutable

         sentence = sentence.toLowerCase(); // reassing. the value will be changed

        System.out.println("____________________________________");

        String s = "           java                 ";
        System.out.println(s.length());
        s= s.trim(); // get's rid off extra spaces in the beggining and in the end.  output --->String
        System.out.println(s);
        System.out.println(s.length());









    }
}
