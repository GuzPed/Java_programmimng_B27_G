package day16_string_methods_3;

public class MoveFirstWord {
    public static void main(String[] args) {
        /*        [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
    Input:
        Java is a fun language
    Output:
        is a fun language Java
         */
        String sentence = "Java is a fun language";

        int fistWordEnd=sentence.indexOf(" ");
        String firstWord = sentence.substring(0,fistWordEnd);
        String secondPartOfSentence = sentence.substring(fistWordEnd+1);

        System.out.println(secondPartOfSentence + " " + firstWord);





    }



}
