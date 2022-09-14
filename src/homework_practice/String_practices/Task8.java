package homework_practice.String_practices;

public class Task8 {
    public static void main(String[] args) {
        /*
        create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL
         */
        String name = "anna lee";

        int indexOfSpace = name.indexOf(" ");
      // String initials = name.charAt(0) + name.substring(indexOfSpace+1, indexOfSpace+2);
        String initials ="" + name.charAt(0) + name.charAt(indexOfSpace+1);


        System.out.println(initials.toUpperCase());




    }
}
