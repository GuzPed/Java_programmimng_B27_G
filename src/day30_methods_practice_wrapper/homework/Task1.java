package day30_methods_practice_wrapper.homework;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
    str = "JAVA java";

output:

    true
         */
        String s = "JAVA java";
        System.out.println(equalTotalNumber(s));
    }

    public static boolean equalTotalNumber(String s){
        int upper = 0, lower = 0;


        for (int i=0; i< s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lower++;
            }
        }

         return upper==lower;





    }
}
