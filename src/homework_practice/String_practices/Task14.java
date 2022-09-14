package homework_practice.String_practices;

public class Task14 {
    public static void main(String[] args) {
        /*
        [Middle char]

Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
         */
        String word = "guzel";
        int length = word.length();

        if (length%2==0) {
            System.out.println("" + word.charAt(length/2-1) + word.charAt(length/2));
        } else if (length%2!=0) {
            System.out.println("" + word.charAt(length/2));
        }


    }
}
