package homework_practice.String_practices;

public class Task6 {
    public static void main(String[] args) {
        /*
        create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters

	houses that have a house number starting with the numbers 500 are on the right side of the street while the address that start with the number 600 are on the left side of the street

	the street they are on is given in the address

		print the street by checking for these streets:

			drive: house on drive

			lane: house on lane

			ave: house on avenue

	Ex:

		Input:
			500312 road w drive, 98404

		Output:
			500312 ROAD W DRIVE, 98404
			house on the right side
			house on drive

	Ex:

		Input:
			600134 South lane, 500415

		Output:
			600134 SOUTH LANE, 500415
			house on the right side
			house on drive

         */
        String address = "500312 road w drive, 98404".trim();

        System.out.println(address.toUpperCase());
        if (address.startsWith("500")) {
            System.out.println("house on the right side");
        } else if (address.startsWith("600")) {
            System.out.println("house on the left side");
        }

        if (address.contains("drive")) {
            System.out.println("house on drive");
        } else if (address.contains("lane")) {
            System.out.println("house on lane");
        } else if (address.contains("ave")) {
            System.out.println("house on avenue");
        }









    }
}
