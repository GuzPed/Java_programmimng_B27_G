package day19_loops_2;

public class CamelCase {
    /*    Camel Case
Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
Ex:
	Today is SUNDAY
	Output:
	todayIsSunday
     */
    public static void main(String[] args) {

        String str = ("Today is SUNDAY").toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int letter = str.charAt(i);

            if (letter == ' ') {
                result+= str.substring(i+1,i+2).toUpperCase();
                i++;


            } else {
                result += str.charAt(i);
            }

        }
        System.out.println(result);
        }




    }

