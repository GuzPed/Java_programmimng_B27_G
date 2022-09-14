package day20_loops_3;

public class ASCII {
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

        String str = "java";
        int result = 0;

        for (int i=0; i<str.length(); i++) {
            result = str.charAt(i);
            System.out.print(result + " ");


        }



    }
}
