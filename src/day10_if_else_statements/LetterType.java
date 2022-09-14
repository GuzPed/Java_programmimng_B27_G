package day10_if_else_statements;
/*
  create a char variable letter. Find and print if the character is a letter, number, or special character
  ex: p
      letter
  ex:
      6
      number
  ex:
      $
      special character
   */
public class LetterType {
    public static void main(String[] args) {
        char c = 'p';
        boolean isLetter = (c>='A' && c<='Z')||(c >='a' && c<='z');
        boolean isNumber = c >='0' && c<='9';

        if (isLetter) {
            System.out.println(" it is letter");
        } else if (isNumber) {
            System.out.println(" It is number");
        } else {
            System.out.println("it is special character");
        }




    }
}
