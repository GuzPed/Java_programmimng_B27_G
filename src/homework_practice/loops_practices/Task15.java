package homework_practice.loops_practices;

public class Task15 {
    public static void main(String[] args) {
        /*
        Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
         */
        String word = "java";
        int a =0;

        for (int i=0; i<word.length(); i++) {
            a = word.charAt(i) ;
            System.out.print(a+ " ");
        }


    }
}
