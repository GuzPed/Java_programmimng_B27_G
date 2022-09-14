package day23_arrays_day2;

import java.util.Arrays;
import java.util.Scanner;

public class PersonInfo_6 {
    public static void main(String[] args) {
        /*
        Student info
        0- id
        1 - first name
        2- last name
        3 - batch name
         */


        //Have all the info
        String[] studentOne = {"04", "Kristina", "Gaidamovic", "27"};
        System.out.println(Arrays.toString(studentOne));

        // know the number of elements, but not the values yet
        String[] studentTwo = new String[4];

        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "BlaBlaname";
        studentTwo[3] = "25";
        System.out.println(Arrays.toString(studentTwo));

        //know the number of elements, and add from Scanner
        Scanner input = new Scanner (System.in);
      /*  String[] studentThree = new String[4];

        System.out.println("Enter you id");
        studentThree[0] = input.next();
        input.nextLine();
        System.out.println("Enter your first name");
        studentThree[1] = input.nextLine();
        System.out.println("Enter your last name");
        studentThree[2] = input.nextLine();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));  */

        // most dynamic
        String[] studentFour = new String[4];
        String[] questions = {"id", "first name", "last name", "batch number"};

        for (int i=0; i<studentFour.length;i++) {
            System.out.println("Enter your " + questions[i]);  // print a dynamic message based on the questions defined in the question elements

            studentFour[i] = input.next(); // storing the scanner input from the console into array at index i

        }
        System.out.println(Arrays.toString(studentFour));


    }

}
