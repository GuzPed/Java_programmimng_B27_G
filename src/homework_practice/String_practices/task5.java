package homework_practice.String_practices;

public class task5 {
    public static void main(String[] args) {
        /*
        create a class Title
ask the user to enter their name including titles
use the following titles to determine how to refer to the person

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them
         */
        String name = " Miss  Maria Jr".toLowerCase().trim();

        boolean mister =  name.startsWith("mr") ||name.startsWith("mister");
        boolean miss = name.startsWith("ms") ||name.startsWith("miss") || name.startsWith("madam");
        boolean dr = name.startsWith("dr");
        boolean endsWithSr = name.endsWith("sr");
        boolean endsWithJr = name.endsWith("jr");


        if (mister) {
            System.out.println("Hello Sir");
        } else if (miss) {
            System.out.println("Hello Ma'am");
        } else if (dr) {
            System.out.println("Hello Doctor");
        }

        if (endsWithSr) {
            System.out.println("Nice to meet you Senior");
        } else if (endsWithJr) {
            System.out.println("Nice to meet you Junior");
        }

    }
}
