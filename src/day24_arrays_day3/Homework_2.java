package day24_arrays_day3;

public class Homework_2 {
    public static void main(String[] args) {
        /*
        Multiple Words

	Given a String of words that are separate by comma and spaces. Find and print any words that have more than one word

	Example

		Input:
			knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer
		Output:
			wooden spoons
			trash can
			dish washer
         */
        String word = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer" ;
        String[] arr = word.split(", ");
        String newArr ="";

        for (String each: arr) {
            if (each.contains(" ")) {
                System.out.println(each);
            }
        }




    }
}
