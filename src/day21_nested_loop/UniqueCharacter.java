package day21_nested_loop;

public class UniqueCharacter {
    public static void main(String[] args) {
        /*
        java
        to print unique characters
         */
        String str = "apples";
        String unique = "";

        for (int i=0; i<str.length(); i++ ) {

                int count = 0;

            for (int j=0; j<str.length(); j++ ) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count==1)
                unique+= str.charAt(i);





}
        System.out.println("unique " + unique );
    }}
