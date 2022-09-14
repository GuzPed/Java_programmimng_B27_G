package day21_nested_loop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "java";
        String checked = "";


        for  (int i =0; i<str.length(); i++) {

            int count = 0;

            if (!checked.contains("" + str.charAt(i))) { // only runs the counting and inner loop if the character has not already been checked

            for (int j=0; j<str.length();j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }


            }
            System.out.println(str.charAt(i) + " - " + count);
            checked+= str.charAt(i);  // add the letter to the checked string

        }}


    }
}
