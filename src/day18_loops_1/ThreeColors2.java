package day18_loops_1;

import java.util.Scanner;

public class ThreeColors2 {
    public static void main(String[] args) {
        /*
        write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
         */
        Scanner input = new Scanner(System.in);
        String colorsSelected = "";
        int count = 0;

        while (count++ < 3) {
            System.out.println("Enter your color");
            String color = input.next();

            if (colorsSelected.contains(color)) {
                System.out.println("Sorry, must be unique color. try again");
                count--;
            } else {
                colorsSelected += color + " ";
            }


        }
        System.out.println("nice choice");
        System.out.println(colorsSelected);






    }

}
