package homework_practice.loops_practices;

public class Tsk10 {
    public static void main(String[] args) {
        /*
        Multiply End

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */
        String str = "java";
        int n=5;
        String newStr ="";

        for (int i=0; i<str.length(); i++) {
            newStr+="" +str.charAt(i);

            if (i==str.length()-1) {
                newStr +="" +str.substring(str.length()-1).repeat(n);
            }

        }
        System.out.println(newStr);






    }
}
