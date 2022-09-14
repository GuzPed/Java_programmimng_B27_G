package day11_nested_if_statement;

import java.util.Scanner;

/*
The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99
 */
public class Movie {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Tell me how long is the movie? and i will tell you the price ");
        double movieHour = input.nextDouble();

        if (movieHour>= 1 && movieHour<=4 ) {
            if (movieHour==1.0) {
                System.out.println("the price for " + movieHour + " hour movie is $8.99");
            } else if (movieHour ==1.5) {
                System.out.println("the price for " + movieHour + " hour movie is $10.50");
            } else if (movieHour ==2.0) {
                System.out.println("the price for " + movieHour + " hour movie is $12.99");
            } else if (movieHour ==2.5) {
                System.out.println("the price for " + movieHour + " hour movie is $14.50");
            } else if (movieHour ==3 || movieHour == 3.5 || movieHour==4) {
                System.out.println("the price for " + movieHour + " hour movie is $15.99");
            }
        } else {
            if (movieHour<=0){
                System.out.println("Movies cannot be less than 0 minutes");
            } else if (movieHour>4) {
                System.out.println("Movies cannot be more than 4 hours");
            }
        }



    }


}
