package day28_methods;

public class Task5 {
    /*
    Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String
 where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld
     */

    public static void main(String[] args) {
        System.out.println(camelCase("JAVA will ruLE tHe wORLd"));
    }

    public static String camelCase(String word) {
                String newWord="";
                word = word.toLowerCase();

        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i)==' ') {
                newWord+= word.substring(i+1,i+2).toUpperCase();
                i++;
            } else {
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }



}
