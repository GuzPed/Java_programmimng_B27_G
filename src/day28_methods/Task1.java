package day28_methods;

public class Task1 {
    /*
     create a method that will that will accept a String and find if it is Palindrome or not (boolean)
     */

    public static void main(String[] args) {
          System.out.println(isPalidrome("anna"));

        }

    public static boolean isPalidrome(String word){
        String reversed="";
        for (int i=word.length()-1; i>=0; i--) {
            reversed += word.charAt(i);
        }         return reversed.equalsIgnoreCase(word);
    }


    }
