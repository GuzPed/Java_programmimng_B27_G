package homework_practice.loops_practices;

public class Task17 {
    public static void main(String[] args) {
        /*
        Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc
         */
        String word = "abcdksdkjgfabc";
        String newWord = "";
        int count= 0;

        for (int i=0; i<word.length();i++) {
            if (!newWord.contains("" + word.charAt(i))) {
                if (word.charAt(i) != word.charAt(i + 1)) {
                    newWord += "" + word.charAt(i);
                }
           }

        }
        System.out.println(newWord);
    }
}
