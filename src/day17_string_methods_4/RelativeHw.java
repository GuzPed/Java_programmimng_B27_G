package day17_string_methods_4;

public class RelativeHw {
    public static void main(String[] args) {
        String name1= "James Bond";
        String name2 = "Jamie Bond";

        int indexOfSpace = name1.lastIndexOf(' ');
        String lastName = name1.substring(indexOfSpace+1); // name1.substring(indexOFSpace).trim();

        if (name2.endsWith(lastName)) {
            System.out.println("Related");
        } else {
            System.out.println("Not Related");
        }

        System.out.println(name2.endsWith(lastName)? "Related" : "Not Related");


    }
}
