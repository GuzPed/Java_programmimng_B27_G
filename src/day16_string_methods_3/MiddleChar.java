package day16_string_methods_3;

public class MiddleChar {
    /*    [Middle char]

Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
     */
    public static void main(String[] args) {
        String word = "elephant";

        int wordLength = word.length();

        if (wordLength%2==0) {
            System.out.println(""+word.charAt(wordLength/2-1)+word.charAt(wordLength/2));
        } else {
            System.out.println(word.charAt(wordLength/2));
        }






    }




}
