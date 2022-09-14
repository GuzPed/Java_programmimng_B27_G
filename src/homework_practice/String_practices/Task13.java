package homework_practice.String_practices;

public class Task13 {
    public static void main(String[] args) {
        /*
        [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.

    Input:
        Java is a fun language
    Output:
        is a fun language Java
         */

        String sentence = "Java is a fun language";
        int indexOfSpace = sentence.indexOf(" ");

        String firstWord = sentence.substring(0,indexOfSpace);
        String restOfSentence = sentence.substring(indexOfSpace+1);

        System.out.println(restOfSentence + " " +firstWord);



    }
}
