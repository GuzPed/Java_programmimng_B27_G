package homework_practice.loops_practices;

public class Task18 {
    public static void main(String[] args) {
        /*
        Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
         */
        String word= "aaabbbcccccddddeeeeeeeeee";
        String longest ="";
        String abs = "";

        for (int i=0; i < word.length()-1;i++) {
            abs += word.charAt(i);

            if (word.charAt(i) != word.charAt(i+1)) {

                if (abs.length() > longest.length()) {
                     longest = abs;
                }
                abs="";
            }

            if (i==word.length()-2 && word.charAt(i) == word.charAt(i+1)) {
                abs += word.charAt(i+1);
                if (abs.length() > longest.length()) {
                    longest = abs;
                }
            }

        }
        System.out.println(longest);
    }
}
