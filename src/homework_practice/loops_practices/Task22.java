package homework_practice.loops_practices;

public class Task22 {
    public static void main(String[] args) {
        /*
        [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates

    variations:
        Write a program that can return the first duplicated character from a string
        Write a program that can return the index number of the first unique character.
         */

        String word = "AAABCCDEEF";
        String letter = "";


        for (int i=0; i < word.length(); i++) {

            int count =0;

            for (int j=0; j< word.length(); j++) {

                if (word.charAt(i)==word.charAt(j)) {
                    count++;
                }

                }
            if (count >1) {
                    letter+= word.charAt(i);
            }
            }
        System.out.println(letter);
        }
 }


