package day21_nested_loop;

public class DuplicateCharacters {
    public static void main(String[] args) {
        /*
        Duplicate characters

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

        String str = "AAABCCDEEF";
        String result = "";

        for (int i=0; i<str.length(); i++) {
            int count = 0;


            for (int j=0; j<str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;

                }
            }
            if (count>1) {
                System.out.println(result);

            }





        }

    }
}
