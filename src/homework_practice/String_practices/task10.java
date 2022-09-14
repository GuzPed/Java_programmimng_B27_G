package homework_practice.String_practices;

public class task10 {
    public static void main(String[] args) {
        /*
        [Create ID]

Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8

         */
        //String firstName = "john";
       // String lastName = "smith";

        String name = "John smith";
        int indexOfSpace = name.indexOf(" ");


        String firstLetter = name.substring(0,1).toLowerCase();
        String threeLetters = name.substring(indexOfSpace+1,indexOfSpace+2).toUpperCase() + name.substring(indexOfSpace+2,indexOfSpace+4).toLowerCase();
        int length = name.substring(0,indexOfSpace).length()*2;

        System.out.println(firstLetter + threeLetters + length);
    }
}
