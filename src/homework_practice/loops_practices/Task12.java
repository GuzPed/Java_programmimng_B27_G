package homework_practice.loops_practices;

public class Task12 {
    public static void main(String[] args) {
        /*
        Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java
         */
        String str = "I love you";
        String reverse = "";
        String secondWord = str.substring(str.indexOf(" ")+1, str.lastIndexOf(" "));


        for (int i = secondWord.length()-1; i>=0; i--) {
         reverse += secondWord.charAt(i);
       }

        System.out.println(str.substring(0,str.indexOf(" ")) + " " + reverse + " " + str.substring(str.lastIndexOf(" ")+1));


    }
}
