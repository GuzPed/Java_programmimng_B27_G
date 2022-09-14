package day20_loops_3;

public class MatchingCharacters {
    /*
    Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
     */
    public static void main(String[] args) {

        String str = "aaabbbcccccddddee ";
        String output = "";
        int count =0;

        for (int i=0; i< str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i+1)) {
                output+=str.charAt(i);
                count++;
            }


        }
        System.out.println(output);


    }
}
