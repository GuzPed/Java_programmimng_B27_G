package day20_loops_3;

public class SpaceProgram2 {
    public static void main(String[] args) {
        String s = "java";
        String result = "";


        for (int i = 0; i<s.length(); i++) {
            char letter = s.charAt(i);

            if (letter == ' ') {
                result+= "_";
            } else {
                result += letter + " ";
            }


        }
        System.out.println(result.trim());




    }
}
