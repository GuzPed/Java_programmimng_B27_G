package my_utils;

public class StringUtil {
    /*
    this class will be used to create String utility methods
     */

    public static String reverse (String str){
        String reverse ="";
        for (int i=str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    //palindrome means the String is the same forward and backwards

    public static boolean isPalindrome(String word){
        return reverse(word).equalsIgnoreCase(word);
    }

//Fix Format
//
//create a method will accept a String and return a String in proper format. Proper format is:
//First character starting as uppercase and the rest as lowercase
//
//Ex:
//	Input:
//		jamES
//
//	Output:
//		James

    public static String fixFormat (String str) {


        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }

    /*
    Camel Case

create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
Exception: First word starts with lowercase

Ex:
	Input:
		JAVA will ruLE tHe wORLd

	Output:
		javaWillRuleTheWorld

     */

    public static String camelCase(String str ){
        String[] allWords = str.split(" ");
        String camelCase = allWords[0].toLowerCase();

        for (int i=1; i<allWords.length; i++) { //starting from index one because we already used the 1 word

            camelCase +=fixFormat(allWords[i]);


        }
return camelCase;

    }

    /*
    given a String and char determine how many times the given char if found in the String
   "java"
   a

   output 2
     */

        public static int frequencyOfChar(String str, char letter) {
            int count = 0;
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == letter) {
                    count++;
                }
            }
            return count;
        }



    public static String getDuplicateCharacters(String str){

        String duplicate ="";
        for (int i=0; i<str.length(); i++) {
            //str.charAt(i) - give every character

            if (duplicate.contains("" +str.charAt(i))){
                continue;
            }
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if (frequency>1) {
                duplicate +=" " + str.charAt(i);
            }
        }
        return duplicate;
    }



}
